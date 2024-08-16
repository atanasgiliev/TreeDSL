
import java.util.*;

public class Translator extends ExprBaseListener {
    private final Stack<Integer> indentationLevels = new Stack<>();
    private final Map<Integer, Integer> parentLineToIndent = new HashMap<>();
    private final Map<Integer, Integer> childIndentation = new HashMap<>();

    private void correctIndentation(int currentIndent, int currentLine) {
        if (!indentationLevels.isEmpty()) {
            int lastIndent = indentationLevels.peek();

            // Allow current indent to be equal or one level more than last indent
            if (currentIndent > lastIndent + 1) {
                throw new RuntimeException("Invalid indentation level at line " + currentLine + ": " + currentIndent + ". Expected: " + lastIndent + " or " + (lastIndent + 1));
            }

            // If this line is a new level, push to the stack
            if (currentIndent == lastIndent + 1) {
                indentationLevels.push(currentIndent);
            }
        } else {
            // For the first line, push the current indentation
            indentationLevels.push(currentIndent);
        }
    }

    private void checkParentRelation(ExprParser.RelationsContext ctx, int currentLine) {
        if (ctx != null) {
            int parentLine = Integer.parseInt(ctx.number().getText());
            if (parentLine >= currentLine) {
                throw new RuntimeException("The reference line number " + parentLine + " in relations at line " + currentLine + " must be smaller than the current line number.");
            }
        }
    }

    private void checkParentsIndentation(ExprParser.ParentsContext ctx, int currentLine) {
        if (ctx != null) {
            int parent1Line = Integer.parseInt(ctx.number(0).getText());
            int parent2Line = Integer.parseInt(ctx.number(1).getText());

            // Check if the parent lines are valid
            if (parent1Line >= currentLine || parent2Line >= currentLine) {
                throw new RuntimeException("Parent lines " + parent1Line + " and " + parent2Line + " must be smaller than the current line number at line " + currentLine + ".");
            }

            // Retrieve the indentation levels of the parents
            Integer parent1Indent = parentLineToIndent.get(parent1Line);
            Integer parent2Indent = parentLineToIndent.get(parent2Line);

            // Check if the parents exist in the mapping and have the same indentation
            if (parent1Indent == null || parent2Indent == null || !parent1Indent.equals(parent2Indent)) {
                throw new RuntimeException("Parents must be on the same indentation level at line " + currentLine + ". Parent lines: " + parent1Line + " and " + parent2Line);
            }
        }
    }

    @Override
    public void exitFirstLine(ExprParser.FirstLineContext ctx) {
        String name = ctx.name().getText().trim();

        // The first line has no parents, so it should be at indentation level 0
        correctIndentation(0, ctx.getStart().getLine());
        checkParentRelation(ctx.relations(), ctx.getStart().getLine());

        // Store the indentation level of the first line in the parentLineToIndent map
        parentLineToIndent.put(ctx.getStart().getLine(), 0);
    }

    @Override
    public void exitLine(ExprParser.LineContext ctx) {
        int currentIndent = ctx.INDENT().size();
        int currentLine = ctx.getStart().getLine();

        String name = ctx.name().getText().trim();

        // Store the current indentation level in the parentLineToIndent map
        parentLineToIndent.put(currentLine, currentIndent);

        // Calculate the parent's line number, if any
        if (ctx.parents() != null) {
            checkParentsIndentation(ctx.parents(), currentLine);

            int parent1Line = Integer.parseInt(ctx.parents().number(0).getText());
            int parent2Line = Integer.parseInt(ctx.parents().number(1).getText());
            int parentLine = Math.min(parent1Line, parent2Line);

            // Ensure all children of the same parents have the same indentation level
            if (childIndentation.containsKey(parentLine)) {
                int expectedIndent = childIndentation.get(parentLine);
                if (currentIndent != expectedIndent) {
                    throw new RuntimeException("Children of the same parents must be at the same indentation level at line " + currentLine + ". Expected indentation: " + expectedIndent + ", but found: " + currentIndent);
                }
            } else {
                childIndentation.put(parentLine, currentIndent);
            }
        }

        // Validate the current indentation
        correctIndentation(currentIndent, currentLine);

        // Check relations for the current line
        checkParentRelation(ctx.relations(), currentLine);
    }

    @Override
    public void exitStart(ExprParser.StartContext ctx) {
        // Clear stacks after parsing is complete
        indentationLevels.clear();
        parentLineToIndent.clear();
        childIndentation.clear();
    }
}

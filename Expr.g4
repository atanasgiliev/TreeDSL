grammar Expr;

@parser::header {
import java.util.Stack;
}

@parser::members {
    Stack<Integer> indentationLevels = new Stack<>();
    int lastIndentationLevel = 0;

    private void correctIndentation(int currentIndent) {
        if (!indentationLevels.isEmpty()) {
            int lastIndent = indentationLevels.peek();
            if (currentIndent > lastIndent + 1) {
                throw new RuntimeException("Invalid indentation level: " + currentIndent + ". Expected: " + lastIndent + " or " + (lastIndent + 1));
            }
        }
        indentationLevels.push(currentIndent);
    }
}

start: firstLine (NEWLINE line)* EOF ;

firstLine
    : name (SPACE)* (parents)? (SPACE)* (relations)?
      { correctIndentation(0); }  // Ensure no indentation on the first line
    ;

line
    : indent+=INDENT* name (SPACE)* (parents)? (SPACE)* (relations)?
      { correctIndentation($indent.size()); }
    ;

name: WORD (SPACE WORD)* ;
parents: number '+' number ;
relations: number ':' special ;
number: NONZERO DIGIT* ;
special: SPECIAL ;

SPECIAL: 'm' | 'd' ;
WORD: [a-zA-Z]+ ;
NONZERO: [1-9] ;
DIGIT: [0-9] ;
SPACE: ' ' ;
INDENT: '    ' ;  // 4 spaces
NEWLINE: '\n' ;

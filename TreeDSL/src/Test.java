import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.nio.file.*;
import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        String filePath = "inputs/test5I.txt";

        try {
            String input = new String(Files.readAllBytes(Paths.get(filePath)));
            CharStream charStream = CharStreams.fromString(input);
            ExprLexer lexer = new ExprLexer(charStream);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            ExprParser parser = new ExprParser(tokens);

            parser.removeErrorListeners();
            parser.addErrorListener(ThrowingErrorListener.INSTANCE);

            try {
                ParseTree tree = parser.start();
                System.out.println("Parse succeeded: " + tree.toStringTree(parser));
            } catch (RuntimeException e) {
                System.err.println("Parse failed: " + e.getMessage());
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

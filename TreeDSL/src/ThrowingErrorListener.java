import org.antlr.v4.runtime.*;

public class ThrowingErrorListener extends BaseErrorListener {
    public static final ThrowingErrorListener INSTANCE = new ThrowingErrorListener();

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer,
                            Object offendingSymbol,
                            int line, int charPositionInLine,
                            String msg,
                            RecognitionException e) {
        throw new RuntimeException("Syntax error at line " + line + ", char " + charPositionInLine + ": " + msg);
    }
}

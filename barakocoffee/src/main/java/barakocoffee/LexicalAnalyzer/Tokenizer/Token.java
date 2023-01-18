package barakocoffee.LexicalAnalyzer.Tokenizer;

public class Token {
    private String lexeme;
    private String type;

    Token (String lexeme, String type) {
        this.lexeme = lexeme;
        this.type = type;
    }

    public String getLexeme() {
        return lexeme;
    }

    public String getType() {
        return type;
    }
}
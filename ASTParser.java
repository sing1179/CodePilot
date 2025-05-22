package backend;

public class ASTParser {
    public ASTNode parse(String code, String fileName) {
        // TODO: Use Tree-sitter or JavaParser to parse code into AST
        return new ASTNode(fileName, "MockAST");
    }
}

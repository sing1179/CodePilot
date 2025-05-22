package backend;

public class ASTNode {
    private String fileName;
    private String astSummary;

    public ASTNode(String fileName, String astSummary) {
        this.fileName = fileName;
        this.astSummary = astSummary;
    }

    public String getFileName() {
        return fileName;
    }

    public String getAstSummary() {
        return astSummary;
    }
}

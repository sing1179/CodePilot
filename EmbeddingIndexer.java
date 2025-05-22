package backend;

import java.util.HashMap;
import java.util.Map;

public class EmbeddingIndexer {
    private Map<String, ASTNode> index = new HashMap<>();

    public void indexFile(String fileName, ASTNode ast) {
        // TODO: Use FAISS/Qdrant for real vector indexing
        index.put(fileName, ast);
        System.out.println("Indexed " + fileName);
    }

    public ASTNode search(String query) {
        // TODO: Use semantic search to find relevant ASTNode
        return index.values().stream().findFirst().orElse(null);
    }
}

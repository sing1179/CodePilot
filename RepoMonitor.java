package backend;

import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

public class RepoMonitor {
    private String repoUrl;
    private GitHubClient gitHubClient;
    private ASTParser astParser;
    private EmbeddingIndexer embeddingIndexer;

    public RepoMonitor(String repoUrl, String githubToken) {
        this.repoUrl = repoUrl;
        this.gitHubClient = new GitHubClient(githubToken);
        this.astParser = new ASTParser();
        this.embeddingIndexer = new EmbeddingIndexer();
    }

    public void startMonitoring() {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                try {
                    String latestCommit = gitHubClient.getLatestCommit(repoUrl);
                    System.out.println("Latest commit: " + latestCommit);
                    String[] files = gitHubClient.getChangedFiles(repoUrl, latestCommit);
                    for (String file : files) {
                        if (file.endsWith(".java") || file.endsWith(".js") || file.endsWith(".py")) {
                            String code = gitHubClient.getFileContent(repoUrl, file);
                            ASTNode ast = astParser.parse(code, file);
                            embeddingIndexer.indexFile(file, ast);
                        }
                    }
                } catch (IOException e) {
                    System.err.println("Error monitoring repo: " + e.getMessage());
                }
            }
        }, 0, 60000); // Check every 60 seconds
    }
}

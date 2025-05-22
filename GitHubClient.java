package backend;

import java.io.IOException;

public class GitHubClient {
    private String token;

    public GitHubClient(String token) {
        this.token = token;
    }

    public String getLatestCommit(String repoUrl) throws IOException {
        // TODO: Use GitHub API to fetch latest commit SHA
        return "mock-latest-commit-sha";
    }

    public String[] getChangedFiles(String repoUrl, String commitSha) throws IOException {
        // TODO: Use GitHub API to fetch changed files in the commit
        return new String[] { "src/Main.java", "src/utils/Helper.java" };
    }

    public String getFileContent(String repoUrl, String filePath) throws IOException {
        // TODO: Use GitHub API to fetch file content
        return "// Java code for " + filePath;
    }
}

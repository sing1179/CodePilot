import backend.*;
import frontend.*;

public class Main {
    public static void main(String[] args) {
        String repoUrl = System.getenv("REPO_URL");
        String githubToken = System.getenv("GITHUB_TOKEN");
        String openaiApiKey = System.getenv("OPENAI_API_KEY");

        if (repoUrl == null || githubToken == null || openaiApiKey == null) {
            throw new RuntimeException("Missing environment variables.");
        }

        RepoMonitor monitor = new RepoMonitor(repoUrl, githubToken);
        monitor.startMonitoring();

        LLMAgent agent = new LLMAgent(openaiApiKey);
        Dashboard dashboard = new Dashboard();

        // Example: User asks for PR description
        String diff = "diff --git a/src/Main.java b/src/Main.java ...";
        String prDesc = agent.generatePRDescription(diff);
        dashboard.showPRSuggestion(prDesc);

        // Example: User asks for code improvement
        String code = "public void foo() { ... }";
        String suggestion = agent.suggestImprovements(code);
        dashboard.showPRSuggestion(suggestion);
    }
}

package backend;

public class LLMAgent {
    private String openaiApiKey;

    public LLMAgent(String openaiApiKey) {
        this.openaiApiKey = openaiApiKey;
    }

    public String generatePRDescription(String diff) {
        // TODO: Call OpenAI/Cohere/Claude API to generate PR description
        return "This PR updates the following files: ...";
    }

    public String suggestImprovements(String code) {
        // TODO: Call LLM to suggest improvements
        return "Consider refactoring this method for clarity.";
    }
}

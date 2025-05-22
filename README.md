// File: README.md
/*
# CodePilot

“An open-source AI engineer that watches your repo, understands your codebase, and automates your dev workflows.”

## Project Description

CodePilot is a self-hosted AI agent that continuously monitors your GitHub repo, understands your architecture, and automates code review, documentation, and test generation using LLMs and AST parsing.

## Setup Instructions

1. Clone the repository:
   ```
   git clone https://github.com/yourusername/codepilot.git
   cd codepilot
   ```

2. Set environment variables in `.env.example` and copy to `.env`.

3. Build and run with Docker:
   ```
   docker build -t codepilot .
   docker run --env-file .env codepilot
   ```

## Technologies Used

- Java 17
- (Planned) Tree-sitter/JavaParser for AST
- (Planned) FAISS/Qdrant for vector search
- (Planned) OpenAI/Cohere/Claude for LLM
- Docker

## What I Learned

- Real-time repo monitoring with Java
- Integrating with LLMs for code review
- Securely managing environment variables
- Java project structure and best practices

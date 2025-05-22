FROM openjdk:17
WORKDIR /app
COPY . .
RUN ./gradlew build
CMD ["java", "-cp", "build/classes/java/main", "Main"]
*/

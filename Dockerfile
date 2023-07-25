FROM openjdk:11
WORKDIR /app
COPY Largest.java /app/Largest.java
RUN javac Largest.java
CMD ["java", "Largest"]
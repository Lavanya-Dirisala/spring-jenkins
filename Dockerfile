FROM openjdk:11
EXPOSE 8080
ADD target/jenkins-practice.jar jenkins-practice.jar
ENTRYPOINT ["java","-jar","jenkins-practice.jar"]
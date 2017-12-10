#install Spring Boot artifact
FROM openjdk:8
VOLUME /tmp
EXPOSE 8086
ADD target/springboot-mysql-docker.jar springboot-mysql-docker.jar
RUN sh -c 'touch /springboot-mysql-docker.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/springboot-mysql-docker.jar"]
FROM java:8-jdk-alpine

COPY ./target/gs-spring-boot-0.1.0.jar /usr/app/

WORKDIR /usr/app

RUN sh -c 'touch gs-spring-boot-0.1.0.jar'
EXPOSE 8080
ENTRYPOINT ["java","-jar","gs-spring-boot-0.1.0.jar"]

FROM maven:3.5.2-jdk-8-alpine

RUN apk update
RUN apk add --no-cache --no-progress mysql-client

COPY test-kubernetes/target/test-kubernetes-0.0.1-SNAPSHOT.jar /var/test-kubernetes.jar

CMD java -jar /var/test-kubernetes.jar 
EXPOSE 8080
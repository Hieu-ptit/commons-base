FROM openjdk:17-slim

RUN apt-get update -y
#  && apt-get -y install gettext-base curl telnet ca-certificates

#VOLUME /tmp
WORKDIR /app

COPY ./api/target/*.jar /app/app.jar
#COPY api/config /app/config

EXPOSE 8021

# Add entrypoint.sh script
#ADD devops/k8s/api/entrypoint.sh /app/entrypoint.sh

ENTRYPOINT ["java","-jar", "/app/app.jar"]

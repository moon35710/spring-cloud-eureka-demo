FROM  java:8
WORKDIR /home/admin
COPY  eureka-server/target/eureka-server-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8761

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/home/admin/app.jar"]

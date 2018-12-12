FROM java:8
VOLUME /tmp
EXPOSE 8080
ADD /build/libs/project-1.0.jar project-1.0.jar
ENTRYPOINT ["java","-jar","project-1.0.jar"]
FROM gradle:jdk17 as build
WORKDIR /workspace
COPY . .
RUN gradle build

FROM openjdk:17-alpine as builder
WORKDIR /work/app
COPY --from=build /workspace/build/libs/web-app-docker-0.0.1-SNAPSHOT.jar ./app.jar
CMD ["java", "-jar", "app.jar"]

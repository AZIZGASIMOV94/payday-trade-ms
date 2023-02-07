FROM alpine:3.11.2
RUN apk add --no-cache openjdk11
COPY build/libs/list-stock-ms-0.0.1.jar /app/
WORKDIR /app/
ENTRYPOINT ["java"]
CMD ["-jar", "/app/list-stock-ms-0.0.1.jar"]

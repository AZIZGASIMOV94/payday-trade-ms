FROM alpine:3.11.2
RUN apk add --no-cache openjdk11
COPY build/libs/deposit-cash-ms-0.0.1.jar /app/
WORKDIR /app/
ENTRYPOINT ["java"]
CMD ["-jar", "/app/deposit-cash-ms-0.0.1.jar"]

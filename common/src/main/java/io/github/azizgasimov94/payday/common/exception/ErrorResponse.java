package io.github.azizgasimov94.payday.common.exception;

import org.springframework.http.HttpStatus;

public interface ErrorResponse {
    String getKey();
    String getMessage();
    HttpStatus getHttpStatus();
}

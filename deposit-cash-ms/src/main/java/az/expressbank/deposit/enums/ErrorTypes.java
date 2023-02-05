package az.expressbank.deposit.enums;

import az.expressbank.common.exception.ErrorResponse;
import org.springframework.http.HttpStatus;

public enum ErrorTypes implements ErrorResponse {
    CASH_ACCOUNT_NOT_FOUND("CASH_ACCOUNT_NOT_FOUND", HttpStatus.NOT_FOUND, "Cash Account with user id {id} not found");

    String key;
    HttpStatus httpStatus;
    String message;

    ErrorTypes(String key, HttpStatus httpStatus, String message) {
        this.message = message;
        this.key = key;
        this.httpStatus = httpStatus;
    }

    @Override
    public String getKey() {
        return null;
    }

    @Override
    public String getMessage() {
        return null;
    }

    @Override
    public HttpStatus getHttpStatus() {
        return null;
    }
}

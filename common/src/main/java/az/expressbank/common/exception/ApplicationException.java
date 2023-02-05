package az.expressbank.common.exception;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.text.StringSubstitutor;
import org.springframework.context.MessageSource;
import org.springframework.context.NoSuchMessageException;

import java.util.Locale;
import java.util.Map;

@Slf4j
public class ApplicationException extends RuntimeException {

    static final long serialVersionUID = 1L;

    private final ErrorResponse errorResponse;
    private final Map<String, Object> messageArgs;


    public ApplicationException(ErrorResponse errorResponse, Map<String, Object> messageArgs) {
        this.errorResponse = errorResponse;
        this.messageArgs = messageArgs;
    }

    public ApplicationException(ErrorResponse errorResponse, Map<String, Object> messageArgs, Throwable cause) {
        super(cause);
        this.errorResponse = errorResponse;
        this.messageArgs = messageArgs;
    }

    public ApplicationException(ErrorResponse errorResponse) {
        this.errorResponse = errorResponse;
        this.messageArgs = Map.of();
    }

    public ApplicationException(ErrorResponse errorResponse, Throwable cause) {
        super(cause);
        this.errorResponse = errorResponse;
        this.messageArgs = Map.of();
    }

    public ErrorResponse getErrorResponse() {
        return errorResponse;
    }


    @Override
    public String getMessage() {
        return messageArgs.isEmpty() ? errorResponse.getMessage() :
                StringSubstitutor.replace(errorResponse.getMessage(), messageArgs, "{", "}");
    }

    public String getLocalizedMessage(Locale locale, MessageSource messageSource) {
        try {
            String localizedMessage = messageSource.getMessage(errorResponse.getKey(), new Object[]{}, locale);
            return messageArgs.isEmpty() ? localizedMessage :
                    StringSubstitutor.replace(localizedMessage, messageArgs, "{", "}");
        }catch (NoSuchMessageException ex) {
            log.info("Consider adding localized message for key {} and locale {}", errorResponse.getKey(), locale);
        }
        return getMessage();
    }


}

package io.github.ambitiousliu.exception;

import io.github.ambitiousliu.constant.LogConstant;

public class ValidatorException extends JUtilException {
    public ValidatorException() {
    }

    public ValidatorException(String message) {
        super(LogConstant.VALIDATOR_ERROR + message);
    }

    public ValidatorException(String message, Throwable cause) {
        super(LogConstant.VALIDATOR_ERROR + message, cause);
    }

    public ValidatorException(Throwable cause) {
        super(cause);
    }

    public ValidatorException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(LogConstant.VALIDATOR_ERROR + message, cause, enableSuppression, writableStackTrace);
    }
}
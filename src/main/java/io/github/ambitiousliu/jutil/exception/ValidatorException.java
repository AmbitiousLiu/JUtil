package io.github.ambitiousliu.jutil.exception;

import io.github.ambitiousliu.jutil.constant.LogConstant;

public class ValidatorException extends RuntimeException {
    public ValidatorException() {
        super(LogConstant.VALIDATOR_ERROR);
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

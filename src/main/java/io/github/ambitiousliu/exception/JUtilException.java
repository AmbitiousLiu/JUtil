package io.github.ambitiousliu.exception;

import io.github.ambitiousliu.constant.LogConstant;

public class JUtilException extends RuntimeException {
    public JUtilException() {
    }

    public JUtilException(String message) {
        super(LogConstant.SIGN + message);
    }

    public JUtilException(String message, Throwable cause) {
        super(LogConstant.SIGN + message, cause);
    }

    public JUtilException(Throwable cause) {
        super(cause);
    }

    public JUtilException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(LogConstant.SIGN + message, cause, enableSuppression, writableStackTrace);
    }
}

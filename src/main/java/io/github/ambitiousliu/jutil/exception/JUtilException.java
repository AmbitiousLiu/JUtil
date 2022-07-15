package io.github.ambitiousliu.jutil.exception;

import io.github.ambitiousliu.jutil.constant.LogConstant;

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

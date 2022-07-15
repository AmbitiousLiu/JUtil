package io.github.ambitiousliu.jutil.exception;

/**
 * @author ambitious liu
 * @since 2022/7/4
 */
public class SmoothException extends JUtilException {
    public SmoothException() {
    }

    public SmoothException(String message) {
        super(message);
    }

    public SmoothException(String message, Throwable cause) {
        super(message, cause);
    }

    public SmoothException(Throwable cause) {
        super(cause);
    }

    public SmoothException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

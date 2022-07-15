package io.github.ambitiousliu.jutil.code;

import io.github.ambitiousliu.jutil.exception.SmoothException;
import io.github.ambitiousliu.jutil.function.ExceptionRunnable;

/**
 * @author ambitious liu
 * @since 2022/7/4
 */
public class Smooth {

    public static void run(ExceptionRunnable runnable) {
        try {
            runnable.run();
        } catch (Exception e) {
            throw new SmoothException(e);
        }
    }
}

package io.github.ambitiousliu.jutil.function;

/**
 * @author ambitious liu
 * @since 2022/7/4
 */
@FunctionalInterface
public interface ExceptionRunnable {

    void run() throws Exception;
}

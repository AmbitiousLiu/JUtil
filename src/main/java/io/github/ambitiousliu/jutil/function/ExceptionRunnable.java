package io.github.ambitiousliu.jutil.function;

/**
 * @author ambitious liu
 * @since 2022/7/4
 */
@FunctionalInterface
public interface ExceptionRunnable {

    public abstract void run() throws Exception;
}

package io.github.ambitiousliu.jutil.code;

import io.github.ambitiousliu.jutil.exception.ValidatorException;

import java.util.List;
import java.util.function.BooleanSupplier;
import java.util.function.Predicate;

public class Validator {

    /**
     * 验证单个对象
     * @param object
     * @param predicate
     * @param errorLog 错误信息
     * @param <T>
     */
    public static <T> void validate(T object, Predicate<T> predicate, String errorLog) {
        if (!predicate.test(object)) {
            throw new ValidatorException(errorLog);
        }
    }

    public static void validate(BooleanSupplier predicate, String errorLog) {
        if (!predicate.getAsBoolean()) {
            throw new ValidatorException(errorLog);
        }
    }

    /**
     * 验证单个对象，默认错误信息
     * @param object
     * @param predicate
     * @param <T>
     */
    public static <T> void validate(T object, Predicate<T> predicate) {
        validate(object, predicate, object.toString());
    }

    public static void validate(BooleanSupplier predicate) {
        if (!predicate.getAsBoolean()) {
            throw new ValidatorException();
        }
    }

    /**
     * 验证多个对象
     * @param predicate
     * @param errorLog 错误信息
     * @param objectList
     * @param <T>
     */
    public static <T> void validate(Predicate<T> predicate, String errorLog, List<T> objectList) {
        for (T t : objectList) {
            validate(t, predicate, errorLog);
        }
    }

    /**
     * 验证多个对象，默认错误信息
     * @param predicate
     * @param objectList
     * @param <T>
     */
    public static <T> void validate(Predicate<T> predicate, List<T> objectList) {
        for (T t : objectList) {
            validate(t, predicate);
        }
    }

}


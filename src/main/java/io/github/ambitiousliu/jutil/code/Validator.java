package io.github.ambitiousliu.jutil.code;

import io.github.ambitiousliu.jutil.exception.ValidatorException;

import java.util.List;
import java.util.function.Predicate;

public class Validator {

    public static <T> void validate(T object, Predicate<T> predicate, String errorLog) {
        if (!predicate.test(object)) {
            throw new ValidatorException(errorLog);
        }
    }

    public static <T> void validate(Predicate<T> predicate, String errorLog, List<T> objectList) {
        for (T t : objectList) {
            validate(t, predicate, errorLog);
        }
    }

    public static <T> void validate(T object, Predicate<T> predicate) {
        validate(object, predicate, object.toString());
    }

    public static <T> void validate(Predicate<T> predicate, List<T> objectList) {
        for (T t : objectList) {
            validate(t, predicate);
        }
    }

}


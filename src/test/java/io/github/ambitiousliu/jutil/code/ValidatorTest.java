package io.github.ambitiousliu.jutil.code;

import org.junit.Test;

import java.util.List;

public class ValidatorTest {

    @Test
    public void validate() {
        Validator.validate("abc", (s) -> s.contains("b"), "不包含b");
        Validator.validate((s) -> s.contains("b"), "不包含b", List.of("abc", "bcd"));
        Validator.validate("abc", (s) -> s.contains("b"));
        Validator.validate((s) -> s.contains("b"), List.of("abc", "bcd"));
    }
}
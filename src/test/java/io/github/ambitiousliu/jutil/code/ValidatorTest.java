package io.github.ambitiousliu.jutil.code;

import org.junit.Test;

public class ValidatorTest {

    @Test
    public void validate() {
        Smooth.run(() -> {
            throw new Exception();
        });
    }
}
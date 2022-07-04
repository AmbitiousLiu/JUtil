package io.github.ambitiousliu.jutil.code;

import org.junit.Test;

import java.io.File;
import java.util.List;

public class ValidatorTest {

    @Test
    public void validate() {
        Smooth.run(() -> {
            throw new Exception();
        });
    }
}
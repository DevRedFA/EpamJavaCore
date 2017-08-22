package com.epam.hw1;

import org.junit.jupiter.api.Test;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Ivan on 22.08.2017.
 */
class SubTest {
    @Test
    void main() {
        PrintStream SysOut = System.out;
        ByteArrayOutputStream arrayOutputStream = new ByteArrayOutputStream();
        PrintStream control = new PrintStream(new BufferedOutputStream(arrayOutputStream), true);
        System.setOut(control);
        Sub.main(new String[]{"100", "10"});
        System.setOut(SysOut);
        String correctResult = new String(("90"+ System.lineSeparator()).getBytes(), StandardCharsets.UTF_8);
        String Result = new String(arrayOutputStream.toByteArray(), StandardCharsets.UTF_8);
        assertEquals(Result, correctResult);
    }

}
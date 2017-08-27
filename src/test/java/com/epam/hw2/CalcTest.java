package com.epam.hw2;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {
    @Test
    void main() {
        PrintStream SysOut = System.out;
        ByteArrayOutputStream arrayOutputStream = new ByteArrayOutputStream();
        PrintStream control = new PrintStream(new BufferedOutputStream(arrayOutputStream), true);
        System.setOut(control);
        byte[] inputData = ("MUL" + ' ' + "10.0" + " " + "10.0").getBytes();
        ByteArrayInputStream arrayInputStream = new ByteArrayInputStream(inputData);
        BufferedInputStream inputStream = new BufferedInputStream(arrayInputStream);
        InputStream SysIn = System.in;
        System.setIn(inputStream);
        Calc.setTest();
        Calc.main(new String[0]);
        String s = (" X  XXX XXX X X XXX XXX XXX XXX     XXX " + System.lineSeparator() + " X    X   X X X X   X     X X X     X X " + System.lineSeparator() + " X  XXX XXX XXX XXX XXX  X  XXX     XXX " + System.lineSeparator() + " X  X     X   X   X X X  X  X X       X " + System.lineSeparator() + " X  XXX XXX   X XXX XXX  X  XXX  X  XXX " + System.lineSeparator());
        String correctResult = new String(s.getBytes(), StandardCharsets.UTF_8);
        String Result = new String(arrayOutputStream.toByteArray(), StandardCharsets.UTF_8);
        assertEquals(Result, correctResult);
    }

}
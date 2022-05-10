package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SQRServiceTest {
    @Test
    public void test() {
        SQRService service = new SQRService ();

        int actual = service.theBest (200, 300);
        int expected = 3;

        assertEquals (actual, expected);

    }
}

package com.digitalinnovationone.springbootteste;

import com.digitalinnovationone.springbootteste.controller.TestController;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestUnitController {

    @Test
    public void testUnit()
    {
        TestController controller = new TestController();

        String resultado = controller.saudacao("Taíco");

        assertEquals("Hello, Taíco", resultado);
    }
}

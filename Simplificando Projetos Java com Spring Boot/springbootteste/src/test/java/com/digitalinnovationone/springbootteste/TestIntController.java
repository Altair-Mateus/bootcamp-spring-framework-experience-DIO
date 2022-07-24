package com.digitalinnovationone.springbootteste;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.jupiter.api.Assertions.assertEquals;

@WebMvcTest
@ExtendWith(SpringExtension.class)
public class TestIntController {

    @Autowired
    private MockMvc mvc;

    @Test
    public void testInt() throws Exception
    {
        RequestBuilder requisicao = MockMvcRequestBuilders.get("/test");
        MvcResult resultado = mvc.perform(requisicao).andReturn();

        assertEquals("Hello, DIO", resultado.getResponse().getContentAsString());

    }// Fim do metodo testInt

    @Test
    public void testIntComArgumento() throws Exception
    {
        mvc.perform(MockMvcRequestBuilders.get("/test?nome=Altair"))
                .andExpect(MockMvcResultMatchers.content().string("Hello, Altair"));
    }
}

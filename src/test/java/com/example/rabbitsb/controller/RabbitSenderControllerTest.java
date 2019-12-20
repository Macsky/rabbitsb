package com.example.rabbitsb.controller;

import com.example.rabbitsb.RabbitsbApplication;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RabbitsbApplication.class,webEnvironment = WebEnvironment.RANDOM_PORT)
public class RabbitSenderControllerTest {


    private MockMvc mvc;

    @Before
    public void buildMvc() {
        mvc = MockMvcBuilders.standaloneSetup(RabbitSenderController.class).build();
    }

    @Test
    public void sender() throws Exception {
        MvcResult mvcResult =
                mvc.perform(get("/rabbit/sender")).andExpect(status().is(200)).andReturn();
        String contentAsString = mvcResult.getResponse().getContentAsString();
        System.out.println(contentAsString);

    }

}

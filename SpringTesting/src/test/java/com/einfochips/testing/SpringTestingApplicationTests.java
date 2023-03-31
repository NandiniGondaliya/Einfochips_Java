package com.einfochips.testing;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.containsStringIgnoringCase;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class SpringTestingApplicationTests {
    @Autowired
    private MockMvc mockMvc;
    
    @Test
    void contextLoads() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/home"))
                .andExpect(status().isOk());
    }
    
//    @Test
//    void negativeController() throws Exception{
//    	mockMvc.perform(MockMvcRequestBuilders.get("/index"))
//    	.andExpect(status().isNotFound());
//    }
    @Test
    void negativeController() throws Exception{
  	mockMvc.perform(MockMvcRequestBuilders.get("/index"))
  	.andExpect(content().string(containsStringIgnoringCase("HI")));}
}


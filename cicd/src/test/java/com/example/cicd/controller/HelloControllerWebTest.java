package com.example.cicd.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * HelloControllerWebTest
 */

@WebMvcTest(HelloController.class)
class HelloControllerWebTest {

  @Autowired
  private MockMvc mock;

  @Test
  void shouldReturnHelloWorldFormEndPoint() throws Exception {
    mock.perform(get("/api/hello"))
        .andExpect(status().isOk())
        .andExpect(content().string("Hello World"));
  }

}

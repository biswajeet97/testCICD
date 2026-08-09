package com.example.cicd.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;

public class HelloControllerTest {

  @Test
  void showReturnHelloWorld() {
    HelloController controller = new HelloController();
    ResponseEntity<String> hello = controller.hello();
    assertEquals("Hello World", hello.getBody());
  }

}

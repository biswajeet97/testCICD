package com.example.cicd;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * CicdApplication
 */
@SpringBootApplication
public class CicdApplication implements ApplicationRunner {

  public static void main(String[] args) {
    SpringApplication.run(CicdApplication.class, args);
  }

  @Override
  public void run(ApplicationArguments args) throws Exception {

    System.out.println("This is the application");
  }

}

package com.elearning.courseservice.controller;

import com.elearning.courseservice.config.ServiceConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {
  @Autowired
  ServiceConfig config;

  //mvn clean spring-boot:run -Dspring-boot.run.profiles=prod
  @GetMapping("/configFromConfigServer")
  String getMessage() {
    return config.getEnv();
  }
}

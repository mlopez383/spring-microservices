package com.elearning.courseservice.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@Configuration
public class ServiceConfig {

  @Value("${serverconf.env}")
  private String env = "";

  public String getEnv() {
    return env;
  }
}
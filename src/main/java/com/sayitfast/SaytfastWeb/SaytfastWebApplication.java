package com.sayitfast.SaytfastWeb;

import com.sayitfast.SaytfastWeb.properties.SayitfastWebProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(value = SayitfastWebProperties.class)

public class SaytfastWebApplication {

  public static void main(String[] args) {
    SpringApplication.run(SaytfastWebApplication.class, args);
  }

}

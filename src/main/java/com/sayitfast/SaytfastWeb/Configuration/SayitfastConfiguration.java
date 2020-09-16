package com.sayitfast.SaytfastWeb.Configuration;

import com.sayitfast.SaytfastWeb.properties.SayitfastWebProperties;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.hashids.Hashids;

/**
 * Created by IntelliJ IDEA. User: Rhett Herring 9/15/20 5:31 PM
 */
@Configuration
public class SayitfastConfiguration {

  @Autowired
  private SayitfastWebProperties sayitfastWebProperties;

  public SayitfastWebProperties getSayitfastWebProperties() {
    return sayitfastWebProperties;
  }

  public void setSayitfastWebProperties(
      SayitfastWebProperties sayitfastWebProperties) {
    this.sayitfastWebProperties = sayitfastWebProperties;
  }

  @PostConstruct
  public void init() {
    System.out.println("Load test Data: " + sayitfastWebProperties.getLoadTestData());
  }

  @Autowired
  private Environment env;

  @Bean
  public Hashids hashids() {
    return new Hashids(env.getProperty("giflib.hash.salt"), 8);
  }

}

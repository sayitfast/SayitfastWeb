package com.sayitfast.SaytfastWeb.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by IntelliJ IDEA. User: Rhett Herring 9/15/20 5:24 PM
 */
@ConfigurationProperties(prefix = "sayitfastweb")
public class SayitfastWebProperties {

  private String loadTestData = "SayitfastWebProperties file..................................."
      + "......................................................................................";

  public String getLoadTestData() {
    return loadTestData;
  }

  public void setLoadTestData(String loadTestData) {
    this.loadTestData = loadTestData;
  }
}

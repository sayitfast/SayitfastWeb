package com.sayitfast.SaytfastWeb.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by IntelliJ IDEA. User: Rhett Herring 9/14/20 11:06 PM
 */
@Entity
public class UpdatesPage {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long Id;
  private Date date;
  private String Title;
  private String content;
  private boolean active;
}

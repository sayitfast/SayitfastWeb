package com.sayitfast.SaytfastWeb.Configuration;

import javax.sql.DataSource;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 * Created by IntelliJ IDEA. User: Rhett Herring 9/9/20 5:12 PM
 */
@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

  private final UserDetailsService userDetailsService;

  private final DataSource dataSource;

  public SecurityConfiguration(UserDetailsService userDetailsService, DataSource dataSource) {
    this.userDetailsService = userDetailsService;
    this.dataSource = dataSource;
  }


  @Override
  protected void configure(HttpSecurity http) throws Exception {
    http
        .authorizeRequests()
        .antMatchers("/actuator/*", "/login.html", "/h2-console/**", "/**", "/index").permitAll();
    http
        .authorizeRequests().anyRequest().authenticated();
    http
        .formLogin().loginPage("/login.html").loginProcessingUrl("/login")
        .failureForwardUrl("/login.html?loginFailed=true");
    http
        .rememberMe().userDetailsService(userDetailsService);
    http
        .csrf().disable();
    http
        .headers().frameOptions().disable();
  }

  @Override
  protected void configure(AuthenticationManagerBuilder auth) throws Exception {
    auth.jdbcAuthentication().dataSource(dataSource);
  }

}


//package com.ecommerce.store.config;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http
//                .csrf().disable()  // Disable CSRF for simplicity
//                .authorizeRequests()
//                .antMatchers(HttpMethod.GET, "/getEndpoint").permitAll()     // Allow GET requests
//                .antMatchers(HttpMethod.POST, "/create").permitAll()         // Allow POST requests
//                .antMatchers(HttpMethod.PUT, "/update").authenticated()      // Require authentication for PUT
//                .antMatchers(HttpMethod.DELETE, "/delete").authenticated()   // Require authentication for DELETE
//                .antMatchers(HttpMethod.OPTIONS, "/**").permitAll()          // Allow preflight requests
//                .anyRequest().authenticated();                               // Require authentication for all other requests
//    }
//}

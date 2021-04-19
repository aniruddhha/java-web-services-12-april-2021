package com.ani.training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 *  - What is basic authentication ? -> Every request should be protected by at least username and password is called basic auth..
 *  - How do setup basic authentication ? -> By Adding maven dependency and creating configuration file which extends WebSecurityConfigurerAdapter
 *  - What configure method does ? -> it tell which api needs to authorized and authenticated using basic auth
 *  - What is configure global method ? -> it will configure username, password and role.
 * **/
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.cors().and()
                .authorizeRequests()
                .anyRequest()
                .authenticated()
                .and()
                .httpBasic();
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder bld) throws Exception {
        bld.inMemoryAuthentication()
                .withUser("admin")
                .password("{noop}pass123")
                .roles("USER");
    }
}

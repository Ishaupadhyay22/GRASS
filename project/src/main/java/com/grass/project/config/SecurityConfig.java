package com.grass.project.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

import java.util.ArrayList;
import java.util.List;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {


                http.csrf().disable();/*.authorizeRequests()
                .antMatchers("/").permitAll()
                .antMatchers(HttpMethod.POST,"/newuser").permitAll()
                .antMatchers(HttpMethod.POST, "/login").permitAll()
                .antMatchers(HttpMethod.POST,"/newuser/*").permitAll()
                .antMatchers(HttpMethod.GET,"/master/*").permitAll()
                .antMatchers(HttpMethod.GET,"/exploreCourse").permitAll()
                .anyRequest().authenticated();*/
    }



    @Override
    @Bean
    public UserDetailsService userDetailsService() {
        List<UserDetails> users = new ArrayList<UserDetails>();
        users.add(User.withDefaultPasswordEncoder().username("Admin").password("nimda").roles("USER", "ADMIN").build());
        users.add(User.withDefaultPasswordEncoder().username("Spring").password("Security").roles("USER").build());
        return new InMemoryUserDetailsManager(users);
    }
}
package com.example.bankaccount.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .anonymous().disable()
                .csrf().disable()
                .headers((headers) -> headers
                        .frameOptions().disable())
                .authorizeHttpRequests((requests) -> requests
                        .requestMatchers("/login", "/img/*", "/css/*", "/js/*").permitAll()
                        .requestMatchers("/", "/img/*", "/css/*", "/js/*").authenticated().anyRequest())
                .formLogin((form) -> form
                        .loginPage("/login")
                        .usernameParameter("login")
                        .defaultSuccessUrl("/api/v1/**")
                        .permitAll());
        return http.build();
    }
}

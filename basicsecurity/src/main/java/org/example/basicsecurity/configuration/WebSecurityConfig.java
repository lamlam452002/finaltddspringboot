package org.example.basicsecurity.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.stereotype.Controller;

@Configuration
@Controller
public class WebSecurityConfig {

    //Noi dinh nghia cac cau hinh cho viec xac thuc.
    // Vi du: Cai nay can xac thuc, cai nao khong
    //Form xac thuc la gi:v
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeRequests((request) -> request.requestMatchers("/", "/home", "/index","/about").permitAll().
                anyRequest().authenticated())
                .formLogin((form) -> form.loginPage("/login").
                        permitAll().
                        defaultSuccessUrl("/welcome"));

        return http.build();
    }
}

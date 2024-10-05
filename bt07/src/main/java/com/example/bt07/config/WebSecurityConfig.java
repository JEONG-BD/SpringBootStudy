
package com.example.bt07.config;
import com.example.bt07.service.UserDetailService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import com.example.bt07.service.UserService;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

//import static org.springframework.boot.autoconfigure.security.servlet.PathRequest.toH2Console;
//

@RequiredArgsConstructor
@Configuration
public class WebSecurityConfig {

    private final UserDetailService userDetailService;

    @Bean
    public WebSecurityCustomizer configure(){
        return (web) -> web.ignoring().requestMatchers("/static/*");
    }
//
//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//        return http.authorizeRequests()
//                .requestMatchers("/login", "/signup", "/user").permitAll()
//                .anyRequest().authenticated()
//                .and()
//                .formLogin()
//                .loginPage("/login")
//                .defaultSuccessUrl("/articles"b)
//                .and().logout()
//                .logoutSuccessUrl("/login")
//                .invalidateHttpSession(true)
//                .and().csrf().disable().build();
//
//    }


    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        return http
                .authorizeHttpRequests(authorize -> authorize
                    .requestMatchers("/login", "/signup", "/user").permitAll()
                    .anyRequest()
                    .authenticated())
                .formLogin(formLogin -> formLogin
                    .loginPage("/login")
                    .defaultSuccessUrl("/articles"))
                .logout(logout -> logout
                    .logoutSuccessUrl("/login")
                    .invalidateHttpSession(true))
                .csrf(csrf -> csrf.disable())
                .build();
    }
//
//    @Bean
//    public AuthenticationManager authenticationManager(HttpSecurity http,
//                                                       BCryptPasswordEncoder bCryptPasswordEncoder) throws Exception {
//        AuthenticationManagerBuilder authenticationManager = http.getSharedObject(AuthenticationManagerBuilder.class);
//        authenticationManager.setUse DetailsService(userService).passwordEncoder(bCryptPasswordEsencoder);
//
//        return  authenticationManager.build();
//    }

    @Bean
    public DaoAuthenticationProvider daoAuthenticationProvider() {
        DaoAuthenticationProvider daoAuthenticationProvider = new DaoAuthenticationProvider();
        daoAuthenticationProvider.setPasswordEncoder(bCryptPasswordEncoder());
        daoAuthenticationProvider.setUserDetailsService(userDetailService);
        return daoAuthenticationProvider;
    }

    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }
}

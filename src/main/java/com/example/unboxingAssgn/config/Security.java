package com.example.unboxingAssgn.config;

import com.example.unboxingAssgn.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class Security {

    @Autowired
    private EmployeeService employeeService;

    @Bean
    public NoOpPasswordEncoder passwordEncoder(){
        return (NoOpPasswordEncoder) NoOpPasswordEncoder.getInstance();
    }


    @Bean
    public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception{
        httpSecurity.authorizeHttpRequests(configurer ->
                configurer
                        .requestMatchers("/login", "/").permitAll()
                        .requestMatchers("/billing","/billing/billingView").hasAnyRole("ACCOUNTANT","SALES")
                        .requestMatchers("/payroll","/payroll/payrollView").hasAnyRole("HR", "ACCOUNTANT")
                        .requestMatchers("/payroll/payrollWrite").hasRole("HR")
                        .requestMatchers("/payroll/**").hasRole("HR")
                        .requestMatchers("/billing/billingWrite").hasRole("SALES")
                        .requestMatchers("/customer/**").hasRole("SALES")
                        .requestMatchers("/user/**").hasRole("ADMIN")
                        .anyRequest().authenticated()
        )


                .formLogin(form ->
                        form
                                .loginPage("/login")
                                .defaultSuccessUrl("/home",true)
                                .permitAll()
                )

//                .logout(logoutConfigurer ->
//                        logoutConfigurer
//                                .logoutUrl("/logout")
//                                .logoutSuccessUrl("/login?logout")
//                                .invalidateHttpSession(true)
//                                .deleteCookies("JSESSIONID")
//                                .permitAll()
//                )
                .logout(logout ->
                        logout.permitAll()
                )
                .exceptionHandling(configurer ->
                        configurer.accessDeniedPage("/denied")
                );

        return httpSecurity.build();
    }


}

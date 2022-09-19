package com.example.basicspringsecurity.Configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class ProjectSecurityConfig extends WebSecurityConfigurerAdapter {

    /*
    * myAccount -> Secured
    * myCard -> Secured
    * myBalance -> Secured
    * HomeController -> Not Secured
    * Contact -> Not Secured
    * Notice -> Not Secured
    */

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        /*
         * Default configurations which will secure all the requests
         */

        /*
         * http .authorizeRequests() .anyRequest().authenticated() .and()
         * .formLogin().and() .httpBasic();
         */

        /*
         * Custom configurations as per our requirement
         */
//        http.authorizeRequests()
//                .antMatchers("/home").permitAll()
//                .antMatchers("/contact").permitAll()
//                .antMatchers("/notice").permitAll()
//                .antMatchers("/home").permitAll()
//                .antMatchers("/card").authenticated()
//                .antMatchers("/balance").authenticated()
//                .antMatchers("/account").authenticated()
//                .and().formLogin().and().httpBasic();

        /*
         * Configuration to deny all the requests
         */


          http .authorizeRequests() .anyRequest().denyAll() .and() .formLogin().and()
          .httpBasic();


        /*
        * Configuration to permit all the requests

        * http .authorizeRequests() .anyRequest().permitAll().and().formLogin().and()
                .httpBasic();
        */
    }

}

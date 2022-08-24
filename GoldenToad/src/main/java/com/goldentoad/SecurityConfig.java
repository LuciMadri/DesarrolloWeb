
package com.goldentoad;

import com.goldentoad.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;

/**
 *
 * @author David
 */

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    
    
    @Autowired
    private UserService userDetailsService;
    
      // El metodo que usaremos para desencriptar va a ser de tipo BCryptPasswordEncoder
    @Bean 
    public BCryptPasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
    
      @Bean 
    public UserService getUserService(){
        return new UserService();
    }
    
     @Bean 
    DaoAuthenticationProvider authenticationProvider(){
        DaoAuthenticationProvider daoAuthenticationProvider = new DaoAuthenticationProvider();
        daoAuthenticationProvider.setPasswordEncoder(passwordEncoder());
        daoAuthenticationProvider.setUserDetailsService(getUserService());
        return daoAuthenticationProvider;
    }
    
    @Bean
    public AuthenticationSuccessHandler appAuthenticationSuccessHandler() {
        return new AppAuthenticationSuccessHandler();
    }
    
    public SecurityConfig(UserService userPrincipalDetailsService){
        this.userDetailsService = userPrincipalDetailsService;
    }
    
     @Override 
    protected void configure(AuthenticationManagerBuilder auth){
        auth.authenticationProvider(authenticationProvider());       
    }
    
    // El siguiente metodo funciona para hacer la autenticacion del usuario
    @Override
    protected void configure(HttpSecurity http) throws Exception{
        
        http.authorizeRequests()
                .antMatchers("inventoryN","/crearInventory", "/merchN", "/aboutN", "/crearAbout", "/saveAbout", "/editAbout/{id_about}", "/deleteAbout/{id_about}", 
                        "/newsN", "/crearNews", "/save", "/editNews/{id_news}", "/delete/{id_news}",  "/contactN", "/crearContact", "/saveContact", "/editContact/{id_contact}", "/deleteContact/{id_contact}", 
                         "/helpform", "/crearHelpform", "/saveHelpform", "/editHelpform/{id_helpform}", "/deleteHelpform/{id_helpform}", 
                        "/projectsN", "/crearProjects", "/saveProjects", "/editProjects/{id_projects}", "/delete/{id_projects}")
                .hasRole("ADMIN")
                .antMatchers("/about", "/home", "/index", "/login", "/portafolio", "/contact", "/projects", "/news", "/merch")
                .hasAnyRole("USER", "ADMIN")
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .loginPage("/login").permitAll().defaultSuccessUrl("/home",true)
                
                .and()
                   .exceptionHandling().accessDeniedPage("/errores/403");
                 
              }
                     
    }
                    


package pe.com.capacitacion.config;

import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import pe.com.capacitacion.condition.SpringBootAdminInsecureConditional;

/**
 * InsecureConfig  aplicacion de escenario: ESCENARIO 'NO SEGURO'. 
 * @author cguerra
 **/
 @Conditional( SpringBootAdminInsecureConditional.class )
 @Configuration
 public class InsecureConfig extends WebSecurityConfigurerAdapter{
	
	    @Override
	    protected void configure( HttpSecurity http ) throws Exception{
	    	
	              http.authorizeRequests()
	                   .anyRequest()
	                   .permitAll()
	                   .and()
	                   .csrf()
	                   .disable();
	    }
	    
 }

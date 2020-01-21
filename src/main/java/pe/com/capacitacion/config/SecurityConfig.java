package pe.com.capacitacion.config;

import de.codecentric.boot.admin.server.config.AdminServerProperties;
import pe.com.capacitacion.condition.SpringBootAdminSecureConditional;
import org.springframework.boot.actuate.autoconfigure.security.servlet.EndpointRequest;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;

/**
 * SecurityConfig
 * @author cguerra
 **/
 @Conditional( SpringBootAdminSecureConditional.class )
 @Configuration
 public class SecurityConfig extends WebSecurityConfigurerAdapter{
	
	    private static final String REDIRECT_TO = "redirectTo";
	    private static final String ASSETS      = "/assets/**";
	    private static final String LOGIN       = "/login";
	    private static final String LOGOUT      = "/logout";
	   
	    private final String adminContextPath;
	
	    public SecurityConfig( AdminServerProperties adminServerProperties ){
	           this.adminContextPath = adminServerProperties.getContextPath(); 
	    }
	
	    @Override
	    protected void configure( HttpSecurity http ) throws Exception{
			    	
			      SavedRequestAwareAuthenticationSuccessHandler objSuccessHandler = new SavedRequestAwareAuthenticationSuccessHandler();
			      objSuccessHandler.setTargetUrlParameter( REDIRECT_TO ); 
			
			      http.authorizeRequests()
			          .antMatchers( this.adminContextPath + ASSETS ).permitAll()
			          .antMatchers( this.adminContextPath + LOGIN ).permitAll()
			          .requestMatchers(EndpointRequest.toAnyEndpoint() ).permitAll()
			          .anyRequest().authenticated() 
			          .and()
			          .formLogin()
			          .loginPage( this.adminContextPath + LOGIN )
			          .successHandler( objSuccessHandler )
			          .and()
			          .logout()
			          .logoutUrl( this.adminContextPath + LOGOUT )
			          .and()
			          .httpBasic()
			          .and()
			          .csrf()
			          .disable();
	    }
	    
 }
 
 
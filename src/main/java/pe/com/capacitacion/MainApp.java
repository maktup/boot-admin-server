package pe.com.capacitacion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;
import de.codecentric.boot.admin.server.config.AdminServerProperties;
import de.codecentric.boot.admin.server.config.EnableAdminServer;

/**
 * MainApp
 * @author cguerra
 **/
 @SpringBootApplication
 @EnableAdminServer        //IMPORTANTE: 'BOOT-ADMIN SERVER'
 public class MainApp{
	
		private final String objAdminContextPath; 
	
		public MainApp(AdminServerProperties adminServerProperties) {
			   this.objAdminContextPath = adminServerProperties.getContextPath();
		}
	
		public static void main( String[] argumentos ){
			   SpringApplication.run( MainApp.class, argumentos );
		}
	
		@Bean
		public SecurityWebFilterChain securityWebFilterChainSecure( ServerHttpSecurity http ){
	
			return http.authorizeExchange()
					   .pathMatchers( this.objAdminContextPath + "/assets/**" )
					   .permitAll()
					   .pathMatchers( this.objAdminContextPath + "/login" )
					   .permitAll()
					   .anyExchange()
					   .authenticated()
					   .and()
					   .formLogin()
					   .loginPage( this.objAdminContextPath + "/login" )
					   .and()
					   .logout()
					   .logoutUrl( this.objAdminContextPath + "/logout" )
					   .and()
					   .httpBasic()
					   .and()
					   .csrf()
					   .disable()
					   .build(); 
		}

 }
 

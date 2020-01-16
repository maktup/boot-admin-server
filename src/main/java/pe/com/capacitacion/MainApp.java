package pe.com.capacitacion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration; 
import de.codecentric.boot.admin.server.config.EnableAdminServer;
 
/**
 * MainApp
 * @author cguerra
 **/
@Configuration
@EnableAutoConfiguration
@EnableAdminServer
 public class MainApp{
 
		private String adminServer; 
	/*
		public MainApp( AdminServerProperties adminServer ){
			   this.adminServer = adminServer.getContextPath();
		}
 
		*/
	    public static void main( String[] argumentos ){ 
		 	   SpringApplication.run( MainApp.class, argumentos );
	    }
 
	    /*
		@Bean 
		public SecurityWebFilterChain securityWebFilterChainSecure( ServerHttpSecurity http ){
	
			return http.authorizeExchange()
					   .pathMatchers( this.adminServer + "/assets/**" )
					   .permitAll()
					   .pathMatchers( this.adminServer + "/login" )
					   .permitAll()
					   .anyExchange()
					   .authenticated()
					   .and()
					   .formLogin()
					   .loginPage( this.adminServer + "/login" )
					   .and()
					   .logout()
					   .logoutUrl( this.adminServer + "/logout" )
					   .and()
					   .httpBasic()
					   .and()
					   .csrf()
					   .disable()
					   .build(); 
		}
 */
		
		
		
		
	    /*
		@Bean
		@Profile("insecure")
		public SecurityWebFilterChain securityWebFilterChainPermitAll(ServerHttpSecurity http) {
			return http.authorizeExchange((authorizeExchange) -> authorizeExchange.anyExchange().permitAll())
					.csrf(ServerHttpSecurity.CsrfSpec::disable).build();
		}
		 */
		
        /*
		@Bean
		@Profile("secure")
		public SecurityWebFilterChain securityWebFilterChainSecure(ServerHttpSecurity http) {
			return http
					.authorizeExchange((authorizeExchange) -> authorizeExchange
							.pathMatchers(this.adminServer + "/assets/**" ).permitAll()
							.pathMatchers(this.adminServer + "/login" ).permitAll().anyExchange().authenticated())
					.formLogin((formLogin) -> formLogin.loginPage(this.adminServer + "/login" ))
					.logout((logout) -> logout.logoutUrl(this.adminServer  + "/logout" ))
					.httpBasic(Customizer.withDefaults()).csrf(ServerHttpSecurity.CsrfSpec::disable).build();
		}
		*/
		
        /*
		@Bean
		public LoggingNotifier loggerNotifier(InstanceRepository repository) {
			return new LoggingNotifier(repository);
		}
        */
 }
 

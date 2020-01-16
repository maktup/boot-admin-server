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
 
	    public static void main( String[] argumentos ){ 
		 	   SpringApplication.run( MainApp.class, argumentos );
	    }
  
 }
 

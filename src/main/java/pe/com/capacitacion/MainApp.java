package pe.com.capacitacion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
 
/**
 * MainApp
 * @author cguerra
 **/
//@Configuration
//@EnableAutoConfiguration
//@EnableAdminServer

@SpringBootApplication
@EnableAdminServer
@EnableDiscoveryClient
@EnableScheduling
@Configuration
 public class MainApp{
 
	    public static void main( String[] argumentos ){ 
		 	   SpringApplication.run( MainApp.class, argumentos );
	    }
  
 }
 

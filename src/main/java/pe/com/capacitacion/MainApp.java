package pe.com.capacitacion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication; 
import de.codecentric.boot.admin.server.config.EnableAdminServer;
 
/**
 * MainApp
 * @author cguerra
 **/
@SpringBootApplication
@EnableAdminServer
public class MainApp {

	public static void main(String[] args) {
		   SpringApplication.run( MainApp.class, args );
	}
	
}


package pe.com.capacitacion.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * SpringBootAdminInsecureConditional  aplicacion de escenario: ESCENARIO 'NO SEGURO'.
 * @author cguerra
 **/
 public class SpringBootAdminInsecureConditional implements Condition{
	
	    @Override
	    public boolean matches( ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata ){
	        
	    	   Environment objEntorno = conditionContext.getEnvironment(); 
	           boolean     vRetorno   = false; 
	    	   
	           if( (objEntorno != null) && 
	        	   Boolean.FALSE.toString().equalsIgnoreCase( objEntorno.getProperty( Constants.SPRING_BOOT_ADMIN_SECURITY_ENABLED ) ) ){
	        	   vRetorno = true;
	           }
	           else{
	        	   vRetorno = false;
	           }
	
	           return vRetorno;
	    }
	    
 }

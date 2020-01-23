package pe.com.capacitacion.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * SpringBootAdminSecureConditional  aplicacion de escenario: ESCENARIO 'SI SEGURO'.
 * @author cguerra
 **/
 public class SpringBootAdminSecureConditional implements Condition{
	
	    @Override
	    public boolean matches( ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata ){
		       
	    	   Environment objEntorno = conditionContext.getEnvironment();
	           boolean     vRetorno   = false;  
	           
		       if( (objEntorno == null) || 
		    		objEntorno.getProperty( Constants.SPRING_BOOT_ADMIN_SECURITY_ENABLED ) == null || 
		    		Boolean.TRUE.toString().equalsIgnoreCase( objEntorno.getProperty( Constants.SPRING_BOOT_ADMIN_SECURITY_ENABLED ) ) ){ 
		    	    vRetorno = true;
		       }
	           else{
	        	   vRetorno = false;
	           }
	
	           return vRetorno;
	    }
	    
}

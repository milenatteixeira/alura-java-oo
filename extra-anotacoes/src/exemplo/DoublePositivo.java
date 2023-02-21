package exemplo;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
 * @Redention: essa anotação será utilizada durante a executação da JVM
 * (utilizada para configuração)
 * 
 * */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD) //essa anotação só servirá para atributos
public @interface DoublePositivo {
	
	

}

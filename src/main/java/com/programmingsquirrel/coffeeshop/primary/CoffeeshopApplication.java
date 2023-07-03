package com.programmingsquirrel.coffeeshop.primary;

import com.programmingsquirrel.coffeeshop.primary.impl.MakeCoffeeImplementation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * This class is a basic example of a Spring Project that illustrates the creation of the Application Context and the
 * use of the annotations <b>@Component</b>, <b>@Autowire</b>, and <b>@SpringBootApplication</b>
 *
 * @Author Cesar "Aran" Pasillas
 */
/* <li><b>@SpringBootApplication</b></li> used to mark a configuration class that declares one or more @Bean methods
 * and also triggers auto-configuration and component scanning. It's same as declaring a class with @Configuration,
 * @EnableAutoConfiguration and @ComponentScan annotations*/
@SpringBootApplication
public class CoffeeshopApplication {

	public static void main(String[] args) {

		//Here we create the ApplicationContext that manages the beans and dependencies
		ApplicationContext appContext = SpringApplication.run(CoffeeshopApplication.class, args);

		//Use the ApplicationContext to find which filter is begin used
		MakeCoffeeImplementation makeCoffee = appContext.getBean(MakeCoffeeImplementation.class);

		//Prepares the Coffee
		makeCoffee.prepareCoffe();
	}

}

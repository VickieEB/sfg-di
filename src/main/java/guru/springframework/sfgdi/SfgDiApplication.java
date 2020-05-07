package guru.springframework.sfgdi;

import guru.springframework.sfgdi.examplebeans.DummyDatasource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
//@ComponentScan(basePackages = {"guru.springframework.sfgdi.services","guru.springframework"})
@PropertySource("classpath:datasource.properties")
public class SfgDiApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

//		PetController petController = ctx.getBean("petController", PetController.class);
//		System.out.println("--- The Best Pet is ---");
//		System.out.println(petController.whichPetIsTheBest());

//		MyController myController = (MyController) ctx.getBean("myController");
//		System.out.println("My Controller Says: " + myController.sayHello());
//		System.out.println(ctx.getBean(PropertyInjectionController.class).getGreeting());

		DummyDatasource dummyDatasource = (DummyDatasource) ctx.getBean(DummyDatasource.class);
		System.out.println(dummyDatasource.getUsername() + " \n" + dummyDatasource.getDburl());

	}

}

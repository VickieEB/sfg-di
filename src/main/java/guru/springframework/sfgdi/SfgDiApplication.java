package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.I18nController;
import guru.springframework.sfgdi.controllers.MyController;
import guru.springframework.sfgdi.controllers.PropertyInjectionController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
//@ComponentScan(basePackages = {"guru.springframework.sfgdi.services","guru.springframework"})
public class SfgDiApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

//		PetController petController = ctx.getBean("petController", PetController.class);
//		System.out.println("--- The Best Pet is ---");
//		System.out.println(petController.whichPetIsTheBest());

		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		System.out.println(i18nController.sayHello());

		MyController myController = (MyController) ctx.getBean("myController");
//		System.out.println("------------Primary Bean------------");
//		String greeting = myController.sayHello();
//		System.out.println(myController.sayHello());
//
//		System.out.println("------------Property------------");
//		PropertyInjectionController propertyInjectionController = (PropertyInjectionController) ctx.getBean("propertyInjectionController");
//		System.out.println(propertyInjectionController.getGreeting());
//
//		System.out.println("------------Setter------------");
//		SetterInjectionController setterInjectionController = (SetterInjectionController) ctx.getBean("setterInjectionController");
//		System.out.println(setterInjectionController.getGreeting());
//
//		System.out.println("------------Constructor------------");
//		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
//		System.out.println(constructorInjectedController.getGreeting());

		System.out.println("My Controller Says: " + myController.sayHello());
		System.out.println(ctx.getBean(PropertyInjectionController.class).getGreeting());

	}

}

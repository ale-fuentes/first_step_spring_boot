package edu.alefu.babystep.learn.dependencyinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import edu.alefu.babystep.learn.dependencyinjection.config.AppConfig;

public class LearAboutDependencyInjection {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Checkout checkout = ctx.getBean(Checkout.class);
		checkout.finish();
	
		checkout = ctx.getBean(Checkout.class);
		checkout.finish();

		checkout = ctx.getBean(Checkout.class);
		checkout.finish();
		
		System.out.println(checkout.getQuantityFinished());

		((ConfigurableApplicationContext) ctx).close();
	}
}

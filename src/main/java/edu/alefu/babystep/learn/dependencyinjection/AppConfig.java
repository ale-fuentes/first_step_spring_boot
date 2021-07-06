package edu.alefu.babystep.learn.dependencyinjection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean
	public Printer printer() {
		return new PrinterEpson();
	}
	
	@Bean
	public Checkout checkout(Printer printer) {
		return new Checkout(printer);
	}
	
}

package edu.alefu.babystep.learn;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean
	public Printer printer() {
		return new PrinterHP();
	}
	
	@Bean
	public Checkout checkout(Printer printer) {
		return new Checkout(printer);
	}
	
}

package edu.alefu.babystep.learn.dependencyinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Checkout {

	@Autowired
	@Qualifier("printerHP")
	private Printer printer;
	
//	public Checkout(Printer printer) {
//		this.printer = printer;
//	}
	
	public void finish() {
		printer.printing("buy0001.csv");
	}
	
}

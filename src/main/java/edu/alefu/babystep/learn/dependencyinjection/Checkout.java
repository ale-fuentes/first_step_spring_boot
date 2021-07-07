package edu.alefu.babystep.learn.dependencyinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Checkout {

	private int quantityfinished;
	
	@Autowired
	private Printer printer;

	public void finish() {
		this.printer.printing("buy0001.csv");
		this.quantityfinished++;
	}
	
	public int getQuantityFinished() {
		return this.quantityfinished;
	}
	
}

package edu.alefu.babystep.learn;

public class Checkout {

	private Printer printer;
	
	public Checkout(Printer printer) {
		this.printer = printer;
	}
	
	public void finish() {
		printer.printing("buy0001.csv");
	}
	
}

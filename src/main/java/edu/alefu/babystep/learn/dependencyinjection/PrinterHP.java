package edu.alefu.babystep.learn.dependencyinjection;

public class PrinterHP implements Printer{

	@Override
	public void printing(String document) {
		System.out.println(">>> Printer HP : " + document);
	}
	
}

package edu.alefu.babystep.learn.dependencyinjection;

public class PrinterEpson implements Printer{

	@Override
	public void printing(String document) {
		System.out.println(">>> Printer EPSON : " + document);
	}


}

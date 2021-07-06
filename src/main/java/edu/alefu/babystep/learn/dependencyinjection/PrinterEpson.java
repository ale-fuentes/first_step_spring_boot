package edu.alefu.babystep.learn.dependencyinjection;

import org.springframework.stereotype.Component;

@Component
public class PrinterEpson implements Printer{

	@Override
	public void printing(String document) {
		System.out.println(">>> Printer EPSON : " + document);
	}


}

package edu.alefu.babystep.learn.dependencyinjection;

import org.springframework.stereotype.Component;

@Component
public class PrinterHP implements Printer{

	@Override
	public void printing(String document) {
		System.out.println(">>> Printer HP : " + document);
	}
	
}

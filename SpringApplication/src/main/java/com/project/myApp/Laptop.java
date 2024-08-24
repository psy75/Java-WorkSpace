package com.project.myApp;

//import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component
//@Primary
public class Laptop implements Computer {
	
	public Laptop() {
		System.out.println("In Laptop Constructer ");
	}
	
	public void compile() {
		System.out.println("Compiling in laptop");
	}

}

package com.project.myApp;

//import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component
//@Primary
public class Desktop implements Computer {
	
	public Desktop() {
		System.out.println("In Desktop Constructer ");
	}
	
	public void compile() {
		System.out.println("Compiling in Desktop");
	}

}

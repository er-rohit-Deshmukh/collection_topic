package com.capgemini.demo.lambda;

//to use someMethod() from someInterface - 
//3 options 

////1. class implements interface 
//public class App implements SomeInterface {

//	public static void main(String[] args) 
    App obj = new App();
		obj.someMethod();
	}

	@Override
	public void someMethod() {
		System.out.println("someMethod() implemented.");
	}
}

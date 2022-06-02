 //         3. use lambda expression / lambda method 

//          applicable only with functional interface 

 //         functional interface - which has ONLY ONE abstract method 


package com.capgemini.demo.lambda;

	public class App2
	{

		public static void main(String[] args) 
		{

		//	SomeInterface obj = new SomeInterface();  

		        //   lambda syntax -
	           //    InterfaceName objectName = () -> {method body};

			SomeInterface obj = () -> {
				System.out.println("someMethod() implemented.");
			};

			obj.someMethod();
		}
	}


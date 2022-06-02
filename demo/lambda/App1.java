//2. use anonymous inner class 

package com.capgemini.demo.lambda;

 public class App1 {

	public static void main(String[] args) 
	{

//    	SomeInterface obj = new SomeInterface();     Before semicolon create a anonymous class ,show in below.

		SomeInterface obj = new SomeInterface()
		{			
			@Override
			public void someMethod()
			{
				System.out.println("someMethod() implemented.");
			}
		};  //this is anonymous inner class

	   obj.someMethod();
	}
}




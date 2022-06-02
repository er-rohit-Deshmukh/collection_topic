package com.capgemini.ObjectMethod;

class StudentDriver
{

	public static void main(String[] args)
	{
		Student s1= new Student ("Ram","Shivaji college",101,"Mechanical","male" );
      
	   Student s2= new Student ("sham","Shivaji college",102,"ComputerScience","male" );
	   
	   System.out.println(s1.toString());
       

	   System.out.println(s1==s2);
	   
	   System.out.println(s1 .equals (s2));
	   
	   
	   
	   
			      
			      
	}

}

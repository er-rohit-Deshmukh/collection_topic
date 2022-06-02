package com.capgemini.collection;

import java.util.ArrayList;
import java.util.List;

public class Collection_Demo 
{

	public static void main(String[] args)
	{
     //  int[] arr= {10,20,30.5,"abc",false};
		ArrayList myList = new ArrayList();
     
	System.out.println(myList.size());
	System.out.println(myList);
	
	myList.add(10);
	myList.add(10.5);
	myList.add("abc");
	myList.add(false);
	
	System.out.println(myList.size());
	System.out.println(myList);
	
	myList.remove(2);
	
	System.out.println(myList.size());
	System.out.println(myList);
	   		   
       
	}

}

package com.capgemini.collection;

import java.util.Iterator;
import java.util.List;

public class IteratorDemo {

	public static void main(String[] args)
	{
				
		List<String> list =new ArrayList();
		list.add("sonu");
		list.add("monu");
		list.add("tonu");
		list.add("ponu");
		list.add("gonu");

		System.out.println(list);
		

		System.out.println("iterate using for loop");
		
			for(int i=0;i<list.size();i++)
			{
				System.out.println(list.get(i));
			}
		
			System.out.println("iterate using for each loop");
			{
				for(String element:list)
				{
					System.out.println(element);
				}
				
			System.out.println("iterator using iterator");	
			
			 Iterator<String> it=list.iterator();
			while(it:hasNext())
			{
				System.out.println(it.next());
			}
			
			}	
			
	}

		

	}

}

package com.capgemini.collection;

import java.util.HashMap;

public class MapDemo  
{

	public static void main(String[] args) 
	{
	    HashMap<Integer, String> hm =new HashMap<>();
	    
	   hm.put(1, "one");
	   hm.put(2, "Two");
	   System.out.println(hm);
	   
	   HashMap<String,String> statecode= new HashMap();
	   statecode.put("MH", "Maharastra");
	   statecode.put("TS", "Telangana");
	   statecode.put( "KA", "Karanataka");

	   System.out.println(statecode);
	   System.out.println(statecode.get("TS"));
	   System.out.println(statecode.keySet());
	   System.out.println(statecode.values());
	   

	}

}

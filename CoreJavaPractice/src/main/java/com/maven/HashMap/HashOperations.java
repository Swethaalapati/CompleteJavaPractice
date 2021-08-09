package com.maven.HashMap;
import java.util.HashMap;
import java.util.Map;

public class HashOperations 
{
	public static void main(String args[])
	{  
	  HashMap<Integer,String> map=new HashMap<Integer,String>();  
	  map.put(1,"Swetha");  
	  map.put(2,"Chintu");    
	  map.put(3,"Swathi");  
	  map.put(4,"Ajay");  
	  System.out.println("Hashmap");  
	  for(Map.Entry m : map.entrySet())
	  {    
	  System.out.println(m.getKey()+" "+m.getValue());    
	  }  
	 
	  map.put(5,"Priya Akka");  
	  map.putAll(map);
	  System.out.println("After add Operation");  
	  for(Map.Entry m : map.entrySet())
	  {    
	  System.out.println(m.getKey()+" "+m.getValue());    
	  }
	 
	  map.remove(1);
	  System.out.println("After remove operation");  
	  for(Map.Entry m : map.entrySet())
	  {    
	  System.out.println(m.getKey()+" "+m.getValue());    
	  }
	 
	  map.replace(5, "Krishna Akka");
	  System.out.println("After replace operation");  
	  for(Map.Entry m : map.entrySet())
	  {    
	  System.out.println(m.getKey()+" "+m.getValue());    
	  }
	}
}

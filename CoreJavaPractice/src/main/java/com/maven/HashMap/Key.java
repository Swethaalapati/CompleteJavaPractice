package com.maven.HashMap;
import java.util.HashMap;
import java.util.Map;
	
public class Key 
{
	public static void main(String[] args)
	{
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		int[] arr = {1, 2, 3, 1, 4, 5, 3, 6};
		for(int num : arr)
		{
			if(map.containsKey(num))
			{
				int value = map.get(num);
				map.put(num,value+1);
			}
			else
			{
				map.put(num, 1);
			}
		}
		for(Map.Entry m : map.entrySet())
		{    
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}
}

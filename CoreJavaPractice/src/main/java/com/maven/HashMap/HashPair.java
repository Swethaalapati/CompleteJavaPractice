package com.maven.HashMap;
import java.util.HashMap;
import java.util.Map.Entry;

public class HashPair {

	public static void main(String args[])
	{
		HashMap<Integer, Integer> hashmap = new HashMap<Integer, Integer>();
		
		int arr[] = {1, 2, 3, 4, 1};
		
		approach1(arr);
		
		int arr1[] = {1, 2, 1, 3, 2, 4, 5};
		
		approach2(arr1);
		
		int arr2[] = {7, 7, 8, 9, 8, 8, 9};
		
		approach3(arr2);
	}

	private static void approach3(int[] arr2) {
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int pair = 0;
		for(int i = 0; i < arr2.length; i++)
		{
			if(map.containsKey(arr2[i]))
			{
				int val = map.get(arr2[i]);
				
				if(val == 1) {
					map.put(arr2[i], 0);
					pair++;
				}
				else 
				{
					map.put(arr2[i], i);
				}
				
			}
			else
			{
				map.put(arr2[i], 1);
			}
		}
		System.out.println(pair);
	}

	private static void approach2(int[] arr) {
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int pair = 0;
		for(int i = 0; i < arr.length; i++)
		{
			if(map.containsKey(arr[i]))
			{
				int val = map.get(arr[i]);
				
				map.remove(val);
				pair++;
			}
			else
			{
				
				map.put(arr[i],  1);
			}
				
		}
		System.out.println(pair);
	}

	private static void approach1(int[] arr) {
		
		HashMap<Integer, Integer> hashmap = new HashMap<Integer, Integer>();
		int  pair = 0;
		for(int i : arr)
		{
			
			if(hashmap.containsKey(i))
			{
				int val = hashmap.get(i);
				
				hashmap.put(i, val+1);
			}
			else
			{
				hashmap.put(i, 1);
			}
		}
		
		for(Entry<Integer, Integer> map : hashmap.entrySet())
		{
			pair = pair + (map.getValue()/2);
			
		}
		
		System.out.println(pair);
		
	}
}

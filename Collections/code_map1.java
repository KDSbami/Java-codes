/*
MAPS

hashmap
	linkedHashMap

SortedMap
	TreeMap


map is not a part of collection
uses multiple collection


*/
import java.util.*;

public class code_map1
{
	public static void main(String[] args)
	{
		Map <Integer,String> m=new HashMap();
		m.put(100,"hi");
		m.put(101,"hi");
		m.put(102,"hii");
		System.out.print(m+"\n");

		for(Map.Entry m1:m.entrySet())
		{
			System.out.print(m1.getKey()+" "+m1.getValue()+"\n");
		}	
	}
}
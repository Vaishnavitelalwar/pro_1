package day22_collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

 //wap to traverse TreeMap 
public class MapExampleTraverse {

	public static void main(String[] args) {
 
 
		TreeMap <Integer,String> h3= new TreeMap<Integer,String>();
		h3.put(400, "neha");
		h3.put(800, "ashu");
		h3.put(300, "gagan");
		h3.put(700, "jayant"); 
	 
	// code to view all keys 
		
		for(Integer i: h3.keySet())
		{
			System.out.println(i);
		}
	
		//code to view all values 
		
		for(String s:h3.values())
		{
			System.out.println(s);
		}
		

//code to display key and value together
		
		for(Map.Entry<Integer, String>e : h3.entrySet())
		{
			System.out.println(e.getKey() +"   "+ e.getValue());
		}
		
//to view particular data
		System.out.println(h3.get(100));
	}

}

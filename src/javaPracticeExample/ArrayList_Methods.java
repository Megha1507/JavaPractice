package javaPracticeExample;

import java.util.ArrayList;

public class ArrayList_Methods {

	public static void main(String[] args) 
	{
		ArrayList<String> arr = new ArrayList<String>();
		
	// Display the size of Array List
		
		System.out.println("1. Size of an ArrayList : " + arr.size());
		
	// Adding Elements to an Array'
		
		arr.add("M");
		arr.add("E");
		arr.add("G");
		arr.add("H");
		arr.add("A");
		
	// Rechecking the size of an Array
		
		System.out.println("1. Size of an ArrayList : " + arr.size());
		
	// Remove an element from an ArrayList
		
		System.out.println("Remover element of an array is : "+ arr.remove(0));
		
	// Print ArrayList elements again
		
		System.out.println(arr);
		
	// Check if ArrayList contains element "K"
		
		System.out.println(arr.contains("E")); // True
		System.out.println(arr.contains("K")); // False
		
		
	}

}

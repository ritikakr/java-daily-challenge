package com.books;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Books 
{
	public static void main(String[] args)
	{
	HashMap<String, Double> books = new HashMap<>();
	
	books.put("The Alchemist", 345.00);
    books.put("The Art of War", 195.00);
	books.put("The Lean Startup",450.00);
	books.put("Pride and Prejudice",200.00);
	
	System.out.println(books);
	
	//printing keys
	System.out.println("Books name are:");
	for(String i:books.keySet())
	{
		System.out.println(i);
	}
	
	//printing values
	System.out.println("Price of books are:");
	for(double j: books.values())
	{
		System.out.println(j);
	}
	
	//Single entry
	Set<Map.Entry<String, Double>> s = books.entrySet();
	
	for(Map.Entry<String,Double> it : s)
	{
		System.out.println("Book name is:"+it.getKey()+" "+" Books price is:"+it.getValue());
		
		
	}
	System.out.println(books);
	
	//updating value 
	for (Entry<String, Double> entry : books.entrySet())
	{
        if (entry.getKey().equals("The Art of War")) 
        {
            entry.setValue(250.00);     
        }
	}
	System.out.println(books);
}
}

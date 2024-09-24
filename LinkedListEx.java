package com.linkedlist;
import java.util.*;

public class LinkedListEx 
{
	public static void main(String[] args)
	{
		LinkedList<Integer> l1 = new LinkedList<Integer>();
		
		l1.add(100);
		l1.add(500);
		l1.add(900);
		l1.add(200);
		l1.add(150);
		
		System.out.println(l1);
		
		l1.removeFirst();
		System.out.println(l1);
		
		l1.addLast(450);
		System.out.println(l1);
		
		System.out.println(l1.size());
		
		l1.remove(2);
		System.out.println(l1);
		
	
	}

}

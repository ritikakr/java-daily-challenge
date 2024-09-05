package com.basic;

public class number1to100 
{
	   public static void main(String[] args)
	   {
		   int start=1;
		   int end=100;
		   numbers(start,end);
	   }
	   public static void numbers(int start, int end)
	   {
		   if(start<=end)
		   {
			   System.out.println(start);
			   numbers(start+1,end);
		   }
	   }
}



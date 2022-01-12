# Java Assessment Question 3

## Task 1

Create a class named `ArrayTest` and write a method named `isUnique` that takes an array of integers as a parameter and that returns a boolean value indicating whether or not the values in the array are unique (true for yes, false for no). The values in the list are considered unique if there is no pair of values that are equal. For example, if a variable called list stores the following values:



## Task 2

Write a static method named `isSorted` that accepts an array of doubles as a parameter and returns true if the list is in sorted (nondecreasing) order and false otherwise. For example, if arrays named `list1` and `list2` store `{16.1, 12.3, 22.2, 14.4}` and `{1.5, 4.3, 7.0, 19.5, 25.1, 46.2}` respectively, the calls `isSorted(list1)` and `isSorted(list2)` should return `false` and `true` respectively. Assume the array has at least one element. A one-element array is considered to be sorted. 

Implementation of isSorted method:

public static boolean isSorted(double[] list)
	{
		if(list.length <= 1)
			return true;
		
		for(int i = 0; i < list.length - 1; i++)
		{
			if(list[i] > list[i + 1])
				return false;
		}
		
		return true;
	}




## Task 3

In both these methods if the array has zero elements then `NoElementsInArrayException` should be thrown.

import java.util.*;
public class Main
{
    public static boolean isUnique(int[] a)
	{
	    if(a.length <= 0)
	    {
	        System.out.println("NOElementsInArrayException");
	    }
	    
		for(int i = 0; i < a.length - 1; i++)
		{
			for(int j = i + 1; j < a.length; j++)
			{
				if(a[i] == a[j])
					return false;
			}
		}
		
		return true;
	    
	    
	}
	public static boolean isSorted(double[] list)
	{
	    if(list.length <= 0)
	    {
	        System.out.println("NOElementsInArrayException");
	    }
	    
		if(list.length <= 1)
			return true;
		
		for(int i = 0; i < list.length - 1; i++)
		{
			if(list[i] > list[i + 1])
				return false;
		}
		
		return true;
	    
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		double list[]=new double[n];
		
		for(int i=0;i<n;i++)
		{
		    a[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
		    list[i] = sc.nextDouble();
		}
		System.out.println(Main.isUnique(a));
		System.out.println(Main.isSorted(list));
	}
}
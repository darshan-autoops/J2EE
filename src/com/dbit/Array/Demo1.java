package com.dbit.Array;

public class Demo1 //SINGLE DIMENSION ARRAY
{
	public static void main(String[] args)
	{
		int a[] = {10,20,30,40,50};//The declaration of the array in single line
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		//System.out.println(a[5]);   --> error: ArrayIndexOutOfBoundsException: 5
	}

}

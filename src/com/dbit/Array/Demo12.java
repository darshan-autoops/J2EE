package com.dbit.Array;

import java.util.Scanner;

public class Demo12 //3D jagged arrary
{
	public static void main(String[] args) 
	{
		int a[][][] = new int [2][][];
		a[0] = new int[3][];
		a[0][0] = new int[2];
		a[0][1] = new int[3];
		a[0][2] = new int[2];
		
		a[1] = new int[2][];
		a[1][0] = new int[3];
		a[1][1] = new int[4];
		Scanner sc = new Scanner(System.in);
		
		for (int i=0;i<=a.length-1;i++)
		{
			for (int j=0;j<=a[i].length-1;j++)
			{
				for (int k=0;k<=a[i][j].length-1;k++)
				{
					System.out.println("Enter the marks of student " + k +"of the classroom "+j+" from the school " +i);
					a[i][j][k]= sc.nextInt();

				}
				
			}
		}
		
		for (int i=0;i<=a.length-1;i++)
		{
			for (int j=0;j<=a[i].length-1;j++)
			{
				for (int k=0;k<=a[i][j].length-1 ;k++ )
				{
					System.out.print(a[i][j][k] + " ");

				}
				System.out.println(" ");
				
			}
			
		}

	}

}

package com.dbit.MULTITHREADING;

//creation of threads by extending thread class
import java.util.*;
class MyThread1 extends Thread
{
	public void run() 
	{
		try
		{
			for (int i=0;i<5;i++)
			{
				Thread.sleep(2000);
				System.out.println("sq_num"+(i*i));
			}
		}
		catch (InterruptedException e)
		{
		}
	
	}
}
class MyThread2 extends Thread
{
	public void run()
	{
		try
		{
			for (int i=0;i<5;i++)
			{
				Thread.sleep(2000);
				System.out.println("double_num"+(i*2));
			}
		}
		catch (InterruptedException e)
		{
		}
		
	}
}
public class Demo1 
{
	public static void main(String[] args) 
	{
		System.out.println("main method..!");
		MyThread1 t1= new MyThread1();
		MyThread2 t2 = new MyThread2();

		t1.start();
		t2.start();
		
		t1.run();
		t2.run();
	}

}

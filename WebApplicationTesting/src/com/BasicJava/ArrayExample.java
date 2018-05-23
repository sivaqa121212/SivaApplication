package com.BasicJava;

public class ArrayExample {

	public static void main(String[] args)
	{
		/*int i=10;
		i=20;
		
		System.out.println(i);*/
		
		
		int []a = new int[3];
		
		a[0]=10;
		a[1]=20;
		a[2]=30;
		//a[3]=40;
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		

	}

}

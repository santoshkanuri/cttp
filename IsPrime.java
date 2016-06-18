/*	AIM : to check given number is prime or not
 * Author: Top coders
 *  
 * 	date :2-05-16
 * */

import java.util.Scanner;

public class IsPrime
{
	public static void main(String args[])
	{
		int i=2,num,flag=0;
		
		System.out.print("Enter a number to check the number is a prime or not ::");
		Scanner inp=new Scanner(System.in);
		num=inp.nextInt();
		System.out.println();
		if(num<=1)
		{
			System.out.println(num+" not a prime number");
			System.exit(0);
		}
		while(i<=Math.sqrt(num))
		{
			if(num%i==0)
			{
				
				flag=1;
				System.out.println(num+" is  not a prime it is divisible by "+i);
				System.exit(0);
			}
				i++;
			}
		if(flag==0)
			 System.out.println(num+" is prime number");
	}
	
}

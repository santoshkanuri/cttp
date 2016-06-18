/*	AIM :  conjugutive 1's in a Binary number
 * Author: 
 *  
 * 	date :03-05-16
 * */
 
 
import java.util.Scanner;

public class BinaryConj
{
	public static void main(String args[])
	{
		int number;
		Scanner inp=new Scanner(System.in);
		number=inp.nextInt();
		
		String num=Integer.toBinaryString(number);
		
		
		
		number = Integer.parseInt(num);
		
		//System.out.println(number);
		
		int count=0,rem,temp=0;
		
		while(number != 0)
		{
			rem=number%10;
			if(rem==1)
			{
				temp++;
				if(temp>count)
				{
					count=temp;
				}
			}
			
			else 
				temp=0;
			
			number/=10;
		}
		
		System.out.println(count);
		
	}
	
	
}


/*
		int count=0,flag=0,temp;
		for(int i=0;i< Integer.toBinaryString(number).length();i++)
		{
			if(num.charAt(i)=='1'&&num.charAt(i+1))
			//System.out.println(num.charAt(i));
		}
		
*/

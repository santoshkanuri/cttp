/*
 *  Aim	:	print 1 to  N prime numbers 
 * 	Author: Top coders
 * 	date :	2-05-16
 * */

import java.util.Scanner;
class PrimeNumbers
{
   public static void main (String[] args)
   {		
       int i =0;
       int num =0,end;
       
       Scanner inp=new Scanner(System.in);
       System.out.println("Enter number:");
       end=inp.nextInt();
       
    
		String  primeNumbers = "";
		inp.close();
       
       for (i = 3; i <= end; i++)         
       { 		  	  
          int counter=0; 	  
          for(num =i; num>=1; num--)
	  {
             if(i%num==0)
	     {
 		counter = counter + 1;
	     }
	  }
	  if (counter == 2)	
	  {
	     //Appended the Prime number to the String
	     primeNumbers = primeNumbers + i + " ";
	  }	
       }	
       System.out.println("Prime numbers from 1 to "+end+" are :");
       System.out.println(primeNumbers);
   }
}

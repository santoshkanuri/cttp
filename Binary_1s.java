import java.util.Scanner;
import java.util.Stack;

public class Binary_1s
{
	
	public static void main(String args[])
	{
		int number;
		
		Stack <Integer> stack=new Stack<Integer>();

		Scanner inp=new Scanner(System.in);
		number=inp.nextInt();
		inp.close();

		while(number != 0)
		{
			int d= number%2;
			stack.push(d);
			number/=2;
		}
		
		
		int flag=0,temp=0;
	
		while(!(stack.isEmpty()))
		{
			if(stack.pop()==1)
			{
				flag++;
				
				if(flag>temp)
				{
					temp=flag;
				}
			}
			
			else 
			flag=0;
			
		}
		
		
		System.out.println(temp);
		
	
	
	}
	
	
}

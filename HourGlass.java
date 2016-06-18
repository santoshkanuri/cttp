import java.util.*;
public class HourGlass
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int arr[][]=new int[6][6];
		
		int sum=0,temp=0,i,j,k;
		for (i=0;i<6;i++)
			for (j=0;j<6;j++)
			{
				k=in.nextInt();
				if(k< -9 || k >9 )
				{
					System.out.println("wrong input");
					j--;
				}
				else
					arr[i][j]=k;
		
		
	}
	/*for (i=0;i<6;i++)
			for (j=0;j<6;j++)
				System.out.println(arr[i][j]);*/
}
}

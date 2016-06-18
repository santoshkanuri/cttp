import java.util.*;

class Phonebook 
{
	public static void main(String coder[])
	{
		Map <String,String> phone =new HashMap <String,String>();
		
		Scanner inp=new Scanner(System.in);

		int n=inp.nextInt();
		//String num;
		for(int i=0;i<n;i++)
		{
			String name=inp.next();
			  String num=inp.next();
			
			phone.put(name,num);
		}
		
		while(inp.hasNext())
		{
			String s=inp.next();
			
				if(phone.containsKey(s))
				{
					String ph=(String)phone.get(s);
					System.out.println(s+"="+num);
				}
				
				else
				System.out.println("NOT FOUND");
		}
	}
}

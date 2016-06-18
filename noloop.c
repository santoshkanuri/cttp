#include<stdio.h>
void no_loop(int num);
void no_loop2(int num);
int main()
{
	int num;
	printf("Enter number::\n");
	scanf("%d",&num);
	no_loop(num);
	return 0;
}	
void no_loop(int num){
	int i,flag=1;
	if(num<=0)
	return ;

	i=num;
	while(i<num+1)
	{
		if(flag)
		{
		printf("%d ",i);
		i--;
		if(i==0)
		flag=0;
		}
		if(!flag)
		{
		
		printf("%d ",i);
		i++;	
			}
	}
	
}
	
		
		
		

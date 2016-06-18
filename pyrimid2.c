#include<stdio.h>
void pyrimid(int num);
int main()
{
int num;
	printf("Enter number::\n");
	scanf("%d",&num);
	pyrimid(num);
	return 0;
}	
void pyrimid(int num){
	int i,j,count=1;
	for(i=num;i>0;i--)     //order n
	{
		if(count%2)
		for(j=1;j<=i;j++)       //n2
		{
		printf("%d ",j);
		}
		else
		for(j=i;j>0;j--)          //n2
		{
		printf("%d ",j);
		}
		count++;
		printf("\n");
	}
}

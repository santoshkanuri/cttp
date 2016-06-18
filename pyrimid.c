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
	int i,j;
	for(i=1;i<=num;i++)
	{
		for(j=i;j>=1;j--)
	printf("%d ",j%2);	
	printf("\n");
	}
}

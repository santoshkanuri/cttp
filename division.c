#include<stdio.h>
int main()
{
	int dividend,divisor,quo=0,rem=0,counter=0;
	printf("Enter dividend::\n");
	scanf("%d",&dividend);
	printf("Enter divisor::\n");
	scanf("%d",&divisor);
	while(counter+divisor<dividend){
		counter+=divisor;
		quo++;
	}
	rem=dividend-counter;
	printf("Quotient  :: %d ,remainder %d \n",quo,rem);
	return 0;
}
	
	

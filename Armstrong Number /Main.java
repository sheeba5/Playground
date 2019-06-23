#include <stdio.h>
#include<math.h>
int main() {
	//Type your code
  int n,s=0;
  scanf("%d",&n);
  int a=n,d=n,i=0;
  while(n>0){
    n=n/10;
    i++;
  }
  while(d>0){
    int r=d%10;
    s=s+pow(r,i);
    d=d/10;
  }
  if(s==a)
    printf("Armstrong Number");
  else
    printf("Not an Armstrong Number");
	return 0;
}
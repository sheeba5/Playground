#include <stdio.h>
int main() {
	//Type your code
  int n,r;
  scanf("%d",&n);
  while(n>10){
    r=n%10;
    n=n/10;
  }
  printf("%d",r);
	return 0;
}
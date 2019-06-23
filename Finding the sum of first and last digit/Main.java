#include <stdio.h>
int main() {
	//Type your code
  int n,r;
  scanf("%d",&n);
  int d=n;
  int f=d%10;
  while(n!=0){
    r=n%10;
    n=n/10;
  }
  printf("%d",r+f);
	return 0;
}
#include <stdio.h>
int main() {
	//Type your code
  int n;
  scanf("%d",&n);
  int s=0;
  while(n>0){
    int r=n%10;
    s=s+r;
    n=n/10;
  }
  printf("%d",s);
	return 0;
}
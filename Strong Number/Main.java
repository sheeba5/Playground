#include <stdio.h>
int main() {
	//Type your code
  int n;
  scanf("%d",&n);
  int num=n,s=0;
  while(n>0){
    int r=n%10;
    int f=1;
    for(int i=1;i<=r;i++){
      f=f*i;
    }
    s=s+f;
    n=n/10;
  }
  if(s==num)
    printf("Yes");
  else
    printf("No");
	return 0;
}
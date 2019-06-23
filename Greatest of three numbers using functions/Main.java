#include <stdio.h>
int maxi(int a,int b,int c){
  int m;
  int a1=(a>b)?a:b;
  return (a1>c)?a1:c;
}
int main(){
	// Type your code here
  int a,b,c;
  scanf("%d %d %d",&a,&b,&c);
  int m=maxi(a,b,c);
  printf("%d",m);
  	return 0;
}
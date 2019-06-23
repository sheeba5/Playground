#include<stdio.h>
#include<math.h>
int power(int n,int e){
  return pow(n,e);
}
int main(){
    // Type your code here
  int n,e;
  scanf("%d%d",&n,&e);
  int p=power(n,e);
  printf("%d",p);
  	return 0;
}
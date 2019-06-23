#include<stdio.h>
int su(int n){
  int r=(n*(n+1)/2);
  return r;
}
int main() {
    // Type your code here
  int n;
  scanf("%d",&n);
  int s=su(n);
  printf("%d",s);
  	return 0;
}
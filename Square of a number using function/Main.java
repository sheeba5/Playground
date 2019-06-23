#include<stdio.h>
int sqr(int n){
  return n*n;
}
int main() {
   // Type your code here
  int n;
  scanf("%d",&n);
  int s=sqr(n);
  printf("%d",s);
   return 0;
}
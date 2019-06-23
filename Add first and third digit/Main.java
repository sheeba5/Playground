#include<stdio.h>
int main()
{
  //Type your code here
  int n;
  scanf("%d",&n);
  int f=n%10;
  int l=(n/100)%10;
  printf("%d",f+l);
  
  return 0;
}
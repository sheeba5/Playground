#include<stdio.h>
int main()
{
  //Type your code here
  int n;
  scanf("%d",&n);
  int a[n];
  for(int i=0;i<n;i++){
    scanf("%d",&a[i]);
  }
  int s1,s2;
  scanf("%d %d",&s1,&s2);
  int i1=-1,i2=-1;
  for(int i=0;i<n;i++){
    if(a[i]==s1){
      i1=i;
    }
    if(a[i]==s2){
      i2=i;
    }
  }
  printf("%d\n%d",i1,i2);
  return 0;
}
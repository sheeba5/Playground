#include<stdio.h>
int main()
{
  //Type your code here
  int n;
  scanf("%d",&n);
  int a[n],z[n],j=0;
  for(int i=0;i<n;i++){
    scanf("%d",&a[i]);
    if(a[i]!=0){
      z[j]=a[i];
      j++;
    }
  }
  for(int i=j;i<n;i++){
    z[i]=0;
  }
  for(int i=0;i<n;i++){
    printf("%d ",z[i]);
  }
  return 0;
}
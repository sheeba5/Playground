#include<stdio.h>
int main()
{
	//Try out your code here
  int n;
  scanf("%d",&n);
  int a[n];
  for(int i=0;i<n;i++){
    scanf("%d",&a[i]);
  }
  int t=n/2;
  for(int i=0;i<t;i++){
    for(int j=i+1;j<t;j++){
      if(a[i]>a[j]){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
      }
    }
  }
    for(int i=0;i<n;i++){
      printf("%d ",a[i]);
   }
  
	return 0;
}
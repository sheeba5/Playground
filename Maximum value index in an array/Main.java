// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
int maxi(int a[],int n){
  int m=a[0],j=0;
  for(int i=0;i<n;i++){
    if(a[i]>m){
      m=a[i];
      j=i;
      
    }
  }
  return j;
}
// Main function
int main()
{
  // Type your code here 
  int n;
  scanf("%d",&n);
  int a[n];
  for(int i=0;i<n;i++){
    scanf("%d",&a[i]);
  }
  int s=maxi(a,n);
  printf("%d",s);
  
   return 0;
}
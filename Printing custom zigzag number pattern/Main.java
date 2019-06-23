#include <stdio.h>
int main() {
	// Type your code here
   int n;
   scanf("%d",&n);
  for(int i=1;i<=n;i++){
    if(i%2!=0){
    for(int j=0;j<n;j++){
      if(j==n-1)
       printf("%d",i+1);
      else
        printf("%d",i);
    }
    }
    else{
      for(int j=0;j<n;j++){
        if(j==0)
          printf("%d",i+1);
        else
          printf("%d",i);
      }
    }
    printf("\n");
  }
	return 0;
}
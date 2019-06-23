#include <stdio.h>
int main(){
	// Type your code here
  int n,c=0;
  scanf("%d",&n);
  for(int i=0;i<n;i++){
    for(int j=0;j<i+1;j++){
      if(c%2==0)
        printf("*");
      else
        printf("#");
      c++;
    }
    printf("\n");
  }
  	return 0;
}
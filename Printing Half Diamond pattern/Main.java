#include <stdio.h>
int main() {
	// Type your code here
  int n;
  scanf("%d",&n);
  int k=n;
  for(int i=1;i<=n;i++){
    for(int s=1;s<k;s++)
      printf(" ");
    k--;
    for(int j=1;j<=2*i-1;j++)
      printf("*");
    printf("\n");
  }
	return 0;
}
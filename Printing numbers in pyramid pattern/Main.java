#include <stdio.h>
int main() {
	// Type your code here
  int n;
  scanf("%d",&n);
  int l=1;
  for(int i=0;i<n;i++){
    for(int j=0;j<=(n-i-2);j++)
      printf(" ");
    for(int j=0;j<=i;j++){
      printf("%d ",l);
      l++;
    }
    printf("\n");
  }
	return 0;
}
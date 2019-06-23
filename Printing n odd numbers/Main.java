#include <stdio.h>
int main() {
	//Type your code
  int n;
  scanf("%d",&n);
  int c=0;
  for(int i=0;c<n;i++){
    if(i%2!=0){
      printf("%d\n",i);
      c++;
    }
  }
	return 0;
}
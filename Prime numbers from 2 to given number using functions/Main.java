#include<stdio.h>
void prime(int n){
  int flag=0;
 for(int i = 2; i <= n/2; ++i)
    {
        if(n%i == 0)
        {
            flag = 1;
            break;
        }
    }
  if (flag == 0)
     printf("%d\n", n);
}
int main(){
    // Type your code here
  int n;
  scanf("%d",&n);
  printf("2\n");
  for(int i=3;i<=n;i++){
    prime(i);
    }
  return 0;
  }
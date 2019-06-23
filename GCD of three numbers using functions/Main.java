#include <stdio.h>
int gcd(int a,int b,int c){
  int g1,g;
  for(int i=1; i <= a && i <= b; ++i)
    {
        if(a%i==0 && a%i==0)
            g1 = i;
    }
  for(int i=1; i <= g1 && i <=c; ++i)
    {
        if(g1%i==0 && c%i==0)
            g = i;
    }
  return g;
}
int main() {
	//Type your code here
  int a,b,c;
  scanf("%d %d %d",&a,&b,&c);
  int g=gcd(a,b,c);
  printf("%d",g);
	return 0;
}
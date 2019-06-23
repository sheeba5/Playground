#include<stdio.h>
int main()
{
  //Type your code here
  int i,j,a[9999],m,t;
 scanf("%d",&m);
 for(i=1;i<m;i++)
  {
   scanf("%d",&a[i]);
  }
 for(i=1;i<m;i++)
  {
   for(j=1;j<i;j++)
    {
      if(a[j]>a[j+1])
       {
         t=a[j];
         a[j]=a[j+1];
         a[j+1]=t;
        }
    }
  }
   for(i=2;i<m;i++)
    {
     if(a[i-1]!=a[i]-1)
       {
          printf("%d",a[i]-1);
          break;
       }
  }
  
  return 0;
}
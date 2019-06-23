#include<stdio.h>
#include<string.h>
int main()
{
  //Type your code here
  char str[1000],sub[1000];
 int i,j, l, l1, l2,count=0,count1=0;
    scanf("%[^\n]s", str);
    l1 = strlen(str);
    scanf(" %[^\n]s", sub);
    l2 = strlen(sub);
  for(int k=0;k<l1;k++){
      if(str[k]>=65&&str[k]<=90)
         str[k]=str[k]+32;
   }
  for(int k=0;k<l2;k++){
      if(sub[k]>=65&&sub[k]<=90)
         sub[k]=sub[k]+32;
   }
  int res=0;
     for (int i = 0; i <= l1 - l2; i++) 
    {  
        int j; 
        for (j = 0; j < l2; j++) 
            if (str[i+j] != sub[j]) 
                break; 
   
        if (j == l2)   
        { 
           res++; 
           j = 0; 
        } 
    } 
    printf("%d",res);
  return 0;
}
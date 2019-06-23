#include<stdio.h>
int main()
{
  // Type your code here
  /*char str[1000], revstr[1000];
  int begin, end;
 
  printf("Input a string\n");
  gets(str);
 
  int stringlen = strlen(str);
  end = stringlen - 1;
 
  for (begin = 0; begin < stringlen; begin++) {
   revstr[begin] = str[end];
   end--;
  }
 
  revstr[begin] = '\0';
  printf("%s\n", revstr);*/
  char str[1000];
  gets(str);
  int length = strlen(str); 
    int i; 
    for (i = length - 1; i >= 0; i--) { 
        if (str[i] == ' ') { 
            str[i] = '\0';  
            printf("%s ", &(str[i]) + 1); 
        } 
    } 
    printf("%s", str); 
  return 0;
}
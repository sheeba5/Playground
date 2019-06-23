#include<stdio.h>
int  Rotation_check(char *str1, char *str2)
{
  //Type your code here
  int len1 = strlen(str1);
int len2 = strlen(str2);
char *t;
void *ptr;
if (len1 != len2)		/* Check if sizes of two strings are same */
	return 0;
t = (char *)malloc(sizeof(char)*(len1*2 + 1)); 
t[0] = '\0';
strcat(t, str1);
strcat(t, str1);
ptr = strstr(t, str2); 	   
   free(t);
if (ptr != NULL)
	return 1;
else
	return 0;
}
int main()
{
  char st1[20], st2[20];
  //Type your code here
  scanf("%s %s",st1,st2);
  if(Rotation_check(st1,st2))
    printf("Yes");
  else
    printf("No");
  return 0;
}
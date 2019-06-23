// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
int main()
{
  // Enter your code here 
   int s[26];
  for(int i=0;i<26;i++)
    s[i]=0;
  char str[100];
  gets(str);
  int l=strlen(str);
  for(int i=0;i<l;i++){
    int r=str[i]-'a';
    s[r]++;
  }
  for(int i=0;i<26;i++){
    if(s[i]==0){
      printf("%c ",i+'a');
    }
  }
  
   return 0;
}
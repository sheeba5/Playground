char *replace(char *str, char *orig, char *rep)
{
    static char buffer[4096];
    char *p;
    
    if(!(p = strstr(str, orig)))
    return str;
    
    strncpy(buffer, str, p-str);
    buffer[p-str] =' ';
    
    sprintf(buffer+(p-str), "%s%s", rep, p+strlen(orig));
    
    return buffer;
}
int main()
{
  //Type your code here
  char str[100],str1[50],str2[50];
    gets(str);
    gets(str1);
    gets(str2);
    puts(replace(str, str1, str2));
    
  return 0;
}
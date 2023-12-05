#include <stdio.h>

int main()
{
    char arr[1000];
    int i;
    
    scanf("%s", arr);
    scanf("%d", &i);
    
    printf("%c", arr[i-1]);
}
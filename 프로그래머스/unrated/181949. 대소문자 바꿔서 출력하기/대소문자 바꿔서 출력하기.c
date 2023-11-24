#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main()
{
    char str[21];
    scanf("%s", str);

    for (int i = 0; i < strlen(str); i++)
    {
        if (str[i] > 90)
        {
            str[i] = str[i] - 32;
        }
        else
        {
            str[i] = str[i] + 32;
        }
    }
    printf("%s", str);

}
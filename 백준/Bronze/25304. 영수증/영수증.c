#include <stdio.h>

int main()
{
    int X, N, a, b;
    scanf("%d", &X);
    scanf("%d", &N);
    for(int i = 1; i <= N; i++)
    {
        scanf("%d %d\n", &a, &b);
        X -= a * b;
    }
    
    if(X==0)
        printf("Yes");
    else
        printf("No");
}
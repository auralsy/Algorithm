#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// num_list_len은 배열 num_list의 길이입니다.
int solution(int num_list[], size_t num_list_len) 
{
    int opt1 = 1;
    int opt2 = 0;
    
    for(int i = 0; i < num_list_len; i++)
    {
        opt1 *= num_list[i];
        opt2 += num_list[i];
    }
    
    opt2 = opt2*opt2;
    
    if(opt1 < opt2)
        return 1;
    else if(opt1 > opt2)
        return 0;
}
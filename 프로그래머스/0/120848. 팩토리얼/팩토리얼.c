#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int n) {
    int i = 1;
    int result = 1;
    
    while(result <= n) {
        i++;
        result *= i;
    }
    return i -1;
}
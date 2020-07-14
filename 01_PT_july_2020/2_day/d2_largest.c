#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {

    int a, b;
    scanf("%d", &a);
    scanf("%d", &b);

    int res = (a>b)?a:b;
    printf("%d", res);
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */    
    return 0;
}

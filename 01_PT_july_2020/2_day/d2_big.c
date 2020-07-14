#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {

    int a[4];
    scanf("%d %d %d %d", &a[0], &a[1], &a[2], &a[3]);
    int i ;
    int max = a[0];
    for (i = 1; i<4; i++){
        if (max < a[i])
            max = a[i];
    }
    printf("%d", max);
    return 0;
}

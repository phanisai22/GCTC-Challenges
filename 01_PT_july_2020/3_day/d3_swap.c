#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {

    char a[50], b[50];
    scanf("%s %s", a, b);
    if (strcmp(a, b) > 0){
        printf("%s %s", b, a);
    } else {
        printf("%s %s", a, b);
    }

    return 0;
}

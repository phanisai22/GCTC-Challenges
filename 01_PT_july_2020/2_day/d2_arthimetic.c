#include<stdio.h>

int main(){
    int a[2], i ;
    for (i = 0; i < 2; i++){
        scanf("%d",&a[i]);
    }
    printf("%d", a[0]+a[1]);
    return 0;
}
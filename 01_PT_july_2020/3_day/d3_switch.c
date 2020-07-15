#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {

    char op;
    int num1, num2;
    int result;
    float f;
    scanf("%c", &op);
    scanf("%d", &num1);
    scanf("%d", &num2);


    switch(op)
    {
        case '+': 
            result = num1 + num2;
            break;

        case '-': 
            result = num1 - num2;
            break;

        case '*': 
            result = num1 * num2;
            break;

        case '/': 
            f = num1 / num2;
            printf("%.2f", f);
            return 0;
            break;

        default: 
            printf("Invalid operator");
    }
    
    printf("%d", result);
    return 0;
}

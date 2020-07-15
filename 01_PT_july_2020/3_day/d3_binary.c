
#include <stdio.h>

int main()
{
    long long dec, temp, binary;
    int rem, place = 1;

    binary = 0;

    scanf("%lld", &dec);
   temp = dec;

    while(temp > 0)
    {
        rem = temp % 2;
        binary = (rem * place) + binary;
        temp /= 2;
        place *= 10;
    }

    printf("%lld", binary);

    return 0;
}
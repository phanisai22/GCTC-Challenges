#include <stdio.h>
int main() {
   int year;
   scanf("%d", &year);

   if (year % 400 == 0) {
      printf("Leap Year");
   }
   else if (year % 100 == 0) {
      printf("not leap year");
   }
   else if (year % 4 == 0) {
      printf("Leap Year");
   }
   else {
      printf("not leap year");
   }

   return 0;
}
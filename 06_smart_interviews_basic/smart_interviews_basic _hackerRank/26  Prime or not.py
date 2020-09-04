import math
n = int(input())

if n < 2:
    print("No")
    quit()

for i in range(2, int(math.sqrt(n))):
    if (n % i) == 0:
        print("No")
        break;
else:
    print("Yes")
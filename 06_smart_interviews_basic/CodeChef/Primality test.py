import math
T = int(input())

for k in range(T):
    n = int(input())

    if n < 2:
        print("no")
    else:
        for i in range(2, int(math.sqrt(n))):
            if (n % i) == 0:
                print("no")
                break
        else:
            print("yes")

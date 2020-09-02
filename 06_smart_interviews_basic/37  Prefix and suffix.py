import math

s = input()

l = len(s)

for i in range(l - 1, 0, -1):
    a = s[0:i]
    b = s[l - i:l]

    if (a == b):
        print(i)
        break
else:
    print(0)
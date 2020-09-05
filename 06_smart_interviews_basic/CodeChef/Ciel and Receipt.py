import math

j = list(map(int, input().split()))

d = {}

for i in range(1, 13):
    d[i] = 2**(i - 1)

for _ in range(j[0]):
    n = int(input())
    c = 0
    while n != 0:
        for i in range(1, 12):
            if n >= d[12]:
                n -= d[12]
                c += 1
                break
            if d[i + 1] > n and d[i] < n:
                n = n - d[i]
                c += 1
                break
            if d[i] == n:
                c += 1
                n -= d[i]
            
    print(c)
        

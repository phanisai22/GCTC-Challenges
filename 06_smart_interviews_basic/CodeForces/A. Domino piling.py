n, m = list(map(int, input().split()))
c = 0
if 1 <= m <= 16 and 1 <= n <= 16:
    while True:
        if n >= 2:
            n -= 2
            c += m

        if n == 1:
            n -= 1
            c +=  int(m/2)
        
        if n == 0:
            break

print(c)


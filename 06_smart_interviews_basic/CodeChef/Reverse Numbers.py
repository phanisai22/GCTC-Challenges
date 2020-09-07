l = list(map(int, input().split()))

for _ in range(l[0]):
    n = int(input())
    s = 0
    if (n < 0):
        print('-', end="")
        n = abs(n)

    while n > 0:
        r = n%10
        s = s*10 + r
        n = int(n/10)

    print(s)

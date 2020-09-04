n, m = list(map(int, input().split()))

a = []

for _ in range(n):
    a.append(list(map(int, input().split())))


c = []

for i in range(m):
    temp = []
    for j in range(n):
        temp.append(a[j][i])
    c.append(temp)

for i in range(m):
    print(*c[i])

n, m = list(map(int, input().split()))

a = []
b = []

for _ in range(n):
    a.append(list(map(int, input().split())))

for _ in range(n):
    b.append(list(map(int, input().split())))

c = []

for i in range(n):
    temp = []
    for j in range(m):
        temp.append(a[i][j] + b[i][j])
    c.append(temp)

for i in range(n):
    print(*c[i])


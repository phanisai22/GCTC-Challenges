n, m = list(map(int, input().split()))
a = []
for _ in range(n):
    a.append(list(map(int, input().split())))

c = []

for i in range(n):
    s = 0
    for j in range(m):
        s += a[i][j]
    c.append(s)

print(*c, sep="\n")
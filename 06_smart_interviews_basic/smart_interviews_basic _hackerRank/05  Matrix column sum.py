n, m = list(map(int, input().split()))
a = []
for _ in range(n):
    a.append(list(map(int, input().split())))

c = []

for i in range(m):
    s = 0
    for j in range(n):
        s += a[j][i]
    c.append(s)

print(*c, sep="\n")
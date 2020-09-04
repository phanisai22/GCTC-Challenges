n = int(input())

l = []
k = 1

for i in range(n):
    for _ in range(i):
        l.append(0)
    for j in range(i, n):
        l.append(k)
        k+= 1

for i in range(n):
    for j in range(i, n*n, n):
        if l[j] != 0:
            print(l[j], end=" ")
    print()
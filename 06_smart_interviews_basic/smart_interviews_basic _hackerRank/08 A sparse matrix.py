import math
n, m = list(map(int, input().split()))

a = []

for _ in range(n):
    a.append(list(map(int, input().split())))

h = math.ceil((n * m) / 2)
c = 0


for i in range(n):
    for j in range(m):
        if a[i][j] == 0:
            if c < h:
                c += 1
            else:
                print("Yes")
                quit()
else:
    print("No")

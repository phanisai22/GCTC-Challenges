l = list(map(int, input().split()))
c = 0
for _ in range(l[0]):
    if int(input()) % l[1] == 0:
        c += 1

print(c)
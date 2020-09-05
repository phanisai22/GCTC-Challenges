n = int(input())

l = []

for i in range(n):
    l.append(map(int, input().split()))

c = 0

for li in l:
    if sum(li) > 1:
        c += 1

print(c)
# Not working
n = int(input())
p = []
s = []
s1 = []
s2 = []
for i in range(1, n + 1):
    arr = list(map(int, input().split()))
    s1.append(arr[0])
    s2.append(arr[1])
    su = abs(arr[0] - arr[1])
    if arr[0] > arr[1]:
        p.append(0)
        s.append(su)
    else:
        p.append(1)
        s.append(su)

m = s[0]
j = 0
for i in range(n):
    if s[i] > m:
        m = s[i]
        j = i

print(p[j], end=" ")
print(m)

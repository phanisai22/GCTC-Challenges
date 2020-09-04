l = list(map(int, input().split()))

n = len(l)
s = (n + 1)*(n + 2)/2
m = int(s - sum(l))

print(m)
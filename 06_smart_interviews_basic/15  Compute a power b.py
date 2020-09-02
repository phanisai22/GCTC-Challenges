l = list(map(int, input().split()))

s = 1 
for i in range(l[1]):
    s *= l[0]

print(s)
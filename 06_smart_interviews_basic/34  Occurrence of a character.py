s = input().lower()
a = input()
d = {}

for c in s:
    if c in d:
        d[c] += 1
    else:
        d[c] = 1

if a in d:
    print(d[a])
else:
    print(0)
n = int(input())
arr = list(map(int, input().split()))

d = {}

for item in arr:
    if not item in d:
        d[item] = 1
    else: 
        d[item] += 1

for item in d:
    if d[item] == 1:
        print(item, end= " ")
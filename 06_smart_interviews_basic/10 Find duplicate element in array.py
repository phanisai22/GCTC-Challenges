n = int(input())
arr = list(map(int, input().split()))

d = {}

for item in arr:
    if item in d:
        print(item)
        quit()
    else:
        d[item] = 1
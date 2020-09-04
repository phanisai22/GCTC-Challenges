n = int(input())

arr = list(map(int, input().split()))

s = 0

for n in arr:
    if n % 2 == 1:
        s += n

print(s)
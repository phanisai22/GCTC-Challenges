n = int(input())
arr = list(map(int, input().split()))
a = []

for i in range(len(arr) - 1, -1, -1):
    a.append(arr[i])

print(*a)

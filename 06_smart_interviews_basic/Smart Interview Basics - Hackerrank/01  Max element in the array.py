n = int(input())

arr = list(map(int, input().split()))

m = arr[0];

for i in range(1, n):
    if m < arr[i]:
        m = arr[i]

print(m)
import math

n = int(input())
for _ in range(n):
    arr = list(map(int, input().split()))
    if arr[0] < 2:
        arr[0] = 3
    for i in range(arr[0], arr[1] + 1):
        for j in range(2, int(math.sqrt(i)) + 1):
            if i%j == 0:
                j = i
                break
        else:
            print(i)
    print("\n")
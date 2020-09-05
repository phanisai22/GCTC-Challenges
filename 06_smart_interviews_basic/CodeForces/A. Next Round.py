l = list(map(int, input().split()))
l = list(map(int , input().split()))
arr = list(map(int, input().split()))

c = 0

if l[0] >= l[1] and 0 <= l[0] <= 50 and 0 <= l[1] <= 50:
    for item in arr:
        if arr[l[1] - 1] == 0:
            break
        if arr[l[1] - 1] <= item:
            c += 1

print(c)

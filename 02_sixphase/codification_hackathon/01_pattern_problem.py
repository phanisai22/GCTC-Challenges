n = int(input())

arr = list(range(n+1))

for i in arr:
    if i == 0:
        continue
        
    print(*arr[i:0:-1], sep="", end="")
    print(*arr[2:n - i + 2], sep="")


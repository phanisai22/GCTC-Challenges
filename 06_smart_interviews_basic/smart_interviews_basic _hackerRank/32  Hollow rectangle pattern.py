m, n = list(map(int, input().split()))

for i in range(n):
    if i == 0 or i == n - 1:
        print("*"*m)
        continue
    print("*" + " "*(m - 2)+"*")

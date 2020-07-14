n = int(input())

i, j = 0, 0
flag = False

if n % 2 == 0:
    n = int(n/2)
else:
    n = n - int(n/2)
    flag = True


for k in range(0, n):
    print(2**i, end=" ")
    if flag and k == n-1:
        break
    print(3**j, end=" ")
    i += 1
    j += 1
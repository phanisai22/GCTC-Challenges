n = int(input())
if 1 <= n <= 100:
    if n == 2 or n == 0:
        print("NO")
    elif n % 2 == 0:
        print("YES")
    else:
        print("NO")
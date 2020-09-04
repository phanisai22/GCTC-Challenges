l = list(map(int, input().split()))
a, b, c = l
if a+b > c and a+c > b and c+b > a:
    print("Yes")
else:
    print("No")
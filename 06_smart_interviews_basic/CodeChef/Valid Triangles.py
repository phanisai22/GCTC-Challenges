j = list(map(int, input().split()))

for _ in range(j[0]):
    l = list(map(int, input().split()))
    a, b, c = l
    if a + b + c == 180:
        print("YES")
    else:
        print("NO")

l = list(map(int, input().split()))

for i in range(l[0]):
    a, b, c = list(map(int, input().split()))

    if a > b and a > c:
        if b > c:
            print(b)
        else:
            print(c)
    elif b > a and b > c:
        if a > c:
            print(a)
        else:
            print(c)
    else:
        if a > b:
            print(a)
        else:
            print(b)
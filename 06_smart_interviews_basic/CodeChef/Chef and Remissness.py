j = list(map(int, input().split()))

for _ in range(j[0]):
    a, b = list(map(int, input().split()))
    print(max(a, b), a+b)

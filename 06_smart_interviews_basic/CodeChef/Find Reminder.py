l = list(map(int, input().split()))

for i in range(l[0]):
    j = list(map(int, input().split()))
    s = j[0] % j[1]
    print(s)

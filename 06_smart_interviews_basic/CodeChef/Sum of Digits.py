l = list(map(int, input().split()))

for i in range(l[0]):
    j = list(map(int, input().split()))
    s = 0
    while j[0] != 0:
        s += j[0]%10
        j[0] = int(j[0]/ 10)
    print(s)

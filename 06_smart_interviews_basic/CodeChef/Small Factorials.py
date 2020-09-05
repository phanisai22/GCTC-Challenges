l = list(map(int, input().split()))

for i in range(l[0]):
    j = list(map(int, input().split()))
    s = 1
    for i in range(j[0], 1, -1):
       s *= i
    print(s)

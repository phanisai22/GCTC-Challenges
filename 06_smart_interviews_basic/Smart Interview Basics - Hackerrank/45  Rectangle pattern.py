n = int(input())
l = list(map(str, [i for i in range(n, 0, -1)]))

for i in range(n-1, -1, -1):
    print("".join(l[:i])+"*"+"".join(l[i+1:]))

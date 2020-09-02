n , s = list(map(int, input().split()))
l = list(map(int, input().split()))

for i in range(n):
    if l[i] == s:
        print(i)
        break
else:
    print("-1")

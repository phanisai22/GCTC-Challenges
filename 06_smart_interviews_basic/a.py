def valid(n):
    s = str(n**2)
    l = len(str(n))
    r = s[-l:]
    l = s[:-l] or '0'
    return sum(map(int,(l,r)))==n

a = int(input())
b = int(input())
l = [i for i in range(a,b+1) if valid(i)]
if l:
    print(*l)
else:
    print("INVALID RANGE")


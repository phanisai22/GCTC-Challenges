n, m = list(map(int, input().split()))

if n & (1 << (m -1)):
    print("true")
else:
    print("false")
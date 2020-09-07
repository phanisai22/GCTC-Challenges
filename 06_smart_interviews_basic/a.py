T = int(input())

for k in range(T):
    a, b = list(map(int, input().split()))
    print((a - 1) * (b - 1))

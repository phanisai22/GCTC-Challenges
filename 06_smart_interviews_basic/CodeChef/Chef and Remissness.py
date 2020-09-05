j = list(map(int, input().split()))

for _ in range(j[0]):
    l = list(map(int, input().split()))
    if l[0] < 10:
        print("Thanks for helping Chef!")
    else:
        print(-1)
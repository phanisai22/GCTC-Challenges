j = list(map(int, input().split()))

for _ in range(j[0]):
    l = list(map(int, input().split()))
    if l[0] > l[1]:
        print(">")
    elif l[0] == l[1]:
        print("=")
    else:
        print("<")
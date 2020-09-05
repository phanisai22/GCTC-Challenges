l = list(map(int, input().split()))
for i in range(l[0]):
    s = input()
    co = 0
    for c in s:
        if c == '4':
            co += 1
    
    print(co)
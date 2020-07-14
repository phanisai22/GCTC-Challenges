li = list(map(int, input().split(" ")))
li = li[::-1]
li = li[1:]
print(*sorted(li), sep=" ")
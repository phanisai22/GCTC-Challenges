n = int(input())
s = []

for _ in range(n):
    s.append(input())

for string in s:
    l = len(string)
    if l > 10:
        print(string[0]+"{}".format(l - 2)+string[-1])
    else:
        print(string)
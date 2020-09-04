n = input()
s = 0

l = len(n)
d = int(n)

while d:
    s = s + pow(d % 10, l)
    d = d//10

if int(n) == s:
    print("Yes")
else:
    print("No")
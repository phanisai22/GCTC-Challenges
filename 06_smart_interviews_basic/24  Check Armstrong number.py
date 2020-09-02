n = input()
s = 0
for num in n:
    s += int(num) ** 3

if s is int(n):
    print("Yes")
else:
    print("No")
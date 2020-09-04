n = input()
s = 0

for num in n:
    s += int(num)

if int(n)%s == 0:
    print("Yes")
else:
    print("No")
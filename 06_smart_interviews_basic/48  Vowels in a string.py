s = input().lower()

v = 0
a = 0

for c in s:
    if c not in "aeiou":
        print("No")
        break
else:
    print("Yes")
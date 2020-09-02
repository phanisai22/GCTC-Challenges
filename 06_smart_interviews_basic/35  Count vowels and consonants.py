s = input().lower()

v = 0
a = 0

for c in s:
    if c in "aeiou":
        v += 1
    else:
        a += 1

print("{} {}".format(v, a))
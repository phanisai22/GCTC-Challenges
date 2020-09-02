s = input()
r = ''
for c in s:
    if c == c.lower():
        c = c.upper()
    else:
        c = c.lower()
    r += c
print(r)
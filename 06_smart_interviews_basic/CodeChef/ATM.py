s = input().split()
w = int(s[0])
b = float(s[1])

if 0 < w <= 2000 and 0 < b < 2000:
    if w > b or w % 5 != 0:
        b = b
    else:
        b = b - w - 0.5

print("{:.2f}".format(b))

s = input().split()
w = int(s[0])
b = float(s[1])

if w % 5 == 0 and (b > w + 0.5):
    b = b - w - 0.5

print("{:.2f}".format(b))

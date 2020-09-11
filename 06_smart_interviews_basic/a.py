s = input()
if 'A' <= s[0] <= 'Z':
    print(s)
else:
    print(s[0].upper() + s[1:])
s = input()

for c in s:
    if c in "0123456789":
        continue
    else:
        print("No")
        break
else:
    print("Yes")
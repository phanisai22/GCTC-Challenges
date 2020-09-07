n = int(input())
c1 = 0
c2 = 0
s = list(map(int, input().split()))

for item in s:
    if item % 2 == 0:
        c1 += 1
    elif item % 2 != 0:
        c2 += 1
    else:
        continue

if c1 > c2:
    print("READY FOR BATTLE")
else:
    print("NOT READY")

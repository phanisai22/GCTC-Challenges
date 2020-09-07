T = int(input())
notes = [100, 50, 10, 5, 2, 1]

for k in range(T):
    n = int(input())
    c = 0
    while n:
        for item in notes:
            if n >= item:
                n -= item
                c += 1
                break

    print(c)

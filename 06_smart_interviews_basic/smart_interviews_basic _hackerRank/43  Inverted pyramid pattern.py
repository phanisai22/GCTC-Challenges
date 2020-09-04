n = int(input())

for i in range(n, 0, -1):
    if i == 1 or i == n:
        print("* "*i)
    else:
        print("* "+"  "*(i - 2)+"*")
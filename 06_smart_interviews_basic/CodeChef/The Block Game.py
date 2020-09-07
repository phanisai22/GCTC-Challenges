T = int(input())

for k in range(T):
    n = input()
    if n == n[::-1]:
        print("wins")
    else:
        print("loses")
    
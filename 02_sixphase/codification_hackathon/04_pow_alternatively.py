n = int(input())

i , j = 0, 0

pow_2, pow_3 = [], []
p2 = n - int(n/2)
if n%2 == 0:
    p3 = p2
else:
    p3 = n - int(n/2) - 1

for _ in range(0, p2):
    pow_2.append(str(2**i))
    i += 1

for _ in range(0, p3):
    pow_3.append(str(3**j))
    j += 1

for i in range(len(pow_2)):
    print(pow_2[i], end=" ")
    try:
        print(pow_3[i], end=" ")
    except(IndexError):
        break
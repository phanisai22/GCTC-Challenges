n = int(input())

a, b = 1, 1
c = 1
for i in range(2, n):
    c = a + b
    a = b
    b = c

print(c)
    
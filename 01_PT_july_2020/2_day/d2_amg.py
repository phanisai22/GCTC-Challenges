n = input().split('=')
n = int(n[1])

sum = 0

for i in range(10, n+1):
    i = str(i)
    for j in range(len(i)):
        sum += int(i[j]) ** len(i)

    if int(i) == sum:
        print(i)
    sum = 0
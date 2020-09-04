n = int(input())

for i in range(65, 65 + n):
    temp = []
    for j in range(65, i+1):
        temp.append(chr(j))
    print(" ".join(temp), end=" ")
    temp.pop()
    print(" ".join(temp[::-1]))
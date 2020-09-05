l = list(map(int, input().split()))
li = []
for i in range(l[0]):
    j = list(map(int, input().split()))
    li.append(j[0])

li.sort()

for item in li:
    print(item)
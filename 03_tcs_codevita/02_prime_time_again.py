def is_prime(value):
    if value==2 or value==3: return True
    if value%2==0 or value<2: return False
    for i in range(3, int(value**0.5)+1, 2):  
        if value%i==0:
            return False    

    return True

hrs, p = list(map(int, input().split()))
time = []
result = []
partitions = 0
p = int(hrs/p)
for i in range(2, hrs+1):
    if partitions != p:
        result.append(i)
        partitions = partitions + 1
    else:
        time.append(result)
        result = []
        partitions = 1
        result.append(i)

time.append(result)

result = 0
flag = 0

for i in range(len(time[0])-1):
    for j in range(len(time)):
        if not is_prime(time[j][i]):
            flag = 0
            break
        flag = 1

    if j == len(time)-1 and flag == 1:
        result = result + 1
print(result)

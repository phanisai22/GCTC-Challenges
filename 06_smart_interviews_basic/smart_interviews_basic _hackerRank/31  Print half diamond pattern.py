n = int(input())

j = n

for i in range(1, n*2):
    if i < n:
        print("*"*i)
    if i >= n:
        print("*"*j)
        j -= 1
    
    
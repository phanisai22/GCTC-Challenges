T = int(input())

for k in range(T):
    n = int(input())
    print(pow(2, (n+2)//2)-1
          if n % 2 == 0 else pow(2, (n+3)//2)-2)

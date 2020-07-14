def isEven(n): 
    isEven = True
    for _ in range(1, n+1):
        if isEven == True:
            isEven = False
        else: 
            isEven = True
  
    return isEven
  
n = int(input())
if isEven(n) == True: 
    print ("Even")
else: 
    print ("Odd")
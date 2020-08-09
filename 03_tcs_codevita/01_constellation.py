n = input()
# matrix_row1 = list(input().split(" "))
# matrix_row2 = list(input().split(" "))
# matrix_row3 = list(input().split(" "))

matrix_row1 = list("* . * # . * * * # . * .".split())
matrix_row2 = list("* . * # . . * . # * * *".split())
matrix_row3 = list("* * * # . * * * # * . *".split())

result = ""

i = 0

while i <= len(matrix_row1) - 3:

    if(matrix_row1[i] and matrix_row2[i] and matrix_row3[i] == '.'):
        i += 1
        continue
    

    if(matrix_row1[i] == '.' and matrix_row1[i + 2] == '.'):
        if (matrix_row3[i + 1] == '.'):
            result += "A"
    elif(matrix_row2[i] == '.' and matrix_row2[i + 2] == '.'):
        result += "I"
    elif(matrix_row1[i + 1] == '.' and matrix_row2[i + 1] == '.'):
        result += "U"
    elif(matrix_row2[i+1] == '.'):
        result += "O"
    else:
        result += "E"
    if i <= len(matrix_row1) - 4 and matrix_row1[i+3] == '#':
        result += "#"
        i += 4
    else:
        i += 3

print(result)

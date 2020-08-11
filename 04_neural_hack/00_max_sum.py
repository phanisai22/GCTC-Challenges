def max_sum(input1, input2, input3):
    row_sum = []
    col_sum = []
    s = 0

    for i in range(input1):
        j = i * input2
        for _ in range(input2):
            s += input3[j]
            j += 1

        row_sum.append(s)
        s = 0

    for i in range(input2):
        for j in range(input1):
            s += input3[i + j*input2]

        col_sum.append(s)
        s = 0

    return max(row_sum) + max(col_sum)


# print(max_sum(3, 3, [3, 6, 9, 1, 4, 7, 2, 8, 9]))
# print(max_sum(2, 2, [1, 2, 5, 6]))
# print(max_sum(2, 3, [1, 2, 3, 4, 5, 6]))
print(max_sum(4, 8, [1, 2, 3, 4, 5, 6, 7, 8,
                     1, 2, 3, 4, 5, 6, 7, 8,
                     1, 2, 3, 4, 5, 6, 7, 8,
                     1, 2, 3, 4, 5, 6, 7, 8, ]))

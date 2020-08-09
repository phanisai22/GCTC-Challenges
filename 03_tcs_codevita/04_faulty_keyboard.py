import itertools as tools

# def cal_values(sub_string):
#     values = {}
#     values[sub_string[1]] = len(sub_string) - 2
#     # sub_string = sub_string[2:]

#     for i in range(2, len(sub_string) - 1):
#         value = 1
#         j = i
#         while (sub_string[j + 1] != '-'):
#             value += 1
#             j += 1
#         value += 1
#         j = i
#         while(sub_string[j - 1] != '-'):
#             value += 1
#             j -= 1
#         value += 1

#         values[sub_string[i]] = value

#     values[sub_string[1:len(sub_string) - 1]] = 1

#     return values

sub_string = list(input())


values = {}
values[sub_string[0]] = len(sub_string)

l = [sub_string[i:j] for i in range(len(sub_string))
     for j in range(i + 1, len(sub_string) + 1)]

l = l[1:][:]



print(values)
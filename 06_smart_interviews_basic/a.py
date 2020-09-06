from functools import cmp_to_key


class Solution:
    # @param A : tuple of integers
    # @return a strings
    def is_largest( a, b):
        return 1 if a+b > b+a else -1

    def largestNumber(self, A):
        A = map(str, A)
        r = "".join(sorted(A, key=cmp_to_key(is_largest, reverse=True)))
        if int(r) == 0:
            return '0'
        r = list(r)
        for j in range(len(r)):
            if r[j] != '0':
                break
        return "".join(r[j:])

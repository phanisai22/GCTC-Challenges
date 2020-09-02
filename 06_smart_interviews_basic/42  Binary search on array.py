n, s = list(map(int, input().split()))
l = list(map(int, input().split()))


def bins(l, start, end, s):
    if start <= end:
        m = start + (end - start) // 2
        if l[m] == s:
            return m
        elif l[m] > s:
            return bins(l, start, m - 1, s)
        else:
            return bins(l, m + 1, end, s)
    else:
        return -1

r = bins(l, 0, n - 1, s)
if r != -1:
    print("true")
else:
    print("false")
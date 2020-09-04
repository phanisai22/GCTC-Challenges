s = input()

d = []
count = 0
i = 0
while(i < len(s)):
    c = s[i]
    while (s[i] == c):
        count += 1
        i += 1
        if i == len(s):
            break
    d.append([c, count])
    count = 0

for l in d:
    print(l[0]+str(l[1]), end="")

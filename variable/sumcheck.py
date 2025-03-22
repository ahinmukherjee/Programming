l = [7, 1, 2, 3, 4, 5, 8]
s = 0
p=0
for i in range(len(l)):
    for j in range(i + 1, len(l)):
        if (l[j] > l[i]):
            s = l[j] - l[i]
            print("Values of", l[j], "and", l[i], "is=", s)
        elif (l[j] < l[i]):
            p = l[j] - l[i]
            print("Values of", l[j], "and", l[i], "is", p)

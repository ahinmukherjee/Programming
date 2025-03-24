l = [7, 1, 2, 3, 4, 5, 8]

for i in range(len(l)):
    for j in range(i + 1, len(l)):
        if (l[j] > l[i]):
            s = l[j] - l[i]
            print("Values of", l[j], "and", l[i], "is=", s)
        elif (l[j] < l[i]):
            p = l[j] - l[i]
            print("Values of", l[j], "and", l[i], "is", p)
        elif(s<p):
            print("hello")

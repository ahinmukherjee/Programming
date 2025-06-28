def Insertion_Short(n):
    for i in range(1, len(n)):
        key= n[i]
        j=i-1

        while j>=0 and n[j]> key:
            n[j+1]= n[j]
            j-=1

        n[j+1]= key
    return n

n=[2, 11, -9, 5, 6, 8, -88]
# Insertion_Short(n)
print("Shorting array is:", Insertion_Short(n))



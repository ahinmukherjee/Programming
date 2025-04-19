matrix1=[]
matrix2=[]
submatrix=[]
row = int(input("Enter number of row: "))
column = int(input("Enter number of column:"))

for i in range(row):
    matrix1.append([])
    for j in range(column):
        num = int(input("Enter value:" " "))
        matrix1[i].append(num)
print("First matrix is",matrix1)

for i in range(row):
    matrix2.append([])
    for j in range(column):
        num = int(input("Enter value:" " "))
        matrix2[i].append(num)
print("Second matrix is",matrix2)

for i in range(row):
    submatrix.append([])
    for j in range(column):
        submatrix[i].append(0)
        submatrix[i][j]= matrix1[i][j] - matrix2[i][j]
print("Subtraction of matrix", submatrix)
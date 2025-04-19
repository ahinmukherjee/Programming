matrix1=[]
matrix2=[]
addmatrix=[]
row = int(input("Enter number of row: "))
column = int(input("Enter number of column:"))

for i in range(row):
    matrix1.append([])
    for j in range(column):
        num = int(input("Enter value:" " "))
        matrix1[i].append(num)
print("Matrix is", matrix1)

for i in range(column):
    matrix2.append([])
    for j in range(row):
        matrix2[i].append(0)
        matrix2[i][j]= matrix1[j][i]
print("Transpose of matrix is:", matrix2)
from array import*
'''BASICS OF ARRAY'''
values=array('i',[5,9,8,4,2])
values.reverse()
print(values)

for i in range(len(values)): #len() predict the length of the array
    print(values[i])

print()

print(values[2]) #accessing the array by using index

newArray=array(values.typecode,[a*a for a in values])
for  b in newArray:
    print(b)



arr=array('i',[])
n=int(input("ENTER THE LENGTH OF THE ARRAY"))
for i in range(n):
    x=int(input("ENTER THE VALUE: "))
    arr.append(x) #append initialize the x value in arr
print(arr)


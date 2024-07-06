'''CODE FOR MAXIMUM VALUE'''
Array=[1,2,3,8,4,5]
#let us assume the first element is the max element
max=Array[0]
for i in range(len(Array)):
    if(max<Array[i]):
        max=Array[i]
print(max)
print()
'''CODE FOR MINIMUM VALUE '''
min=Array[0]
for j in range(len(Array)):
    if(min>Array[j]):
        min=Array[j]
print(min)

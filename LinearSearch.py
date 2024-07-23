def linearSearch(a,target):
    for i in range(len(a)):
        if a[i]==target:
            return i
    return-1
a=[1,2,3,4,5,6,7]
target=4
print(linearSearch(a,target))

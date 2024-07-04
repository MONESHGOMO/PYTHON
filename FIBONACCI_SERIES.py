#condition for fibonacci series the first
# two values are 0 and 1 ,after existing values are the sum of the two previous value
a=0
b=1
sum=0
for i in range(10):
    sum=a+b
    a=b
    b=sum
    print(sum)
# range depends on the value assigned to the for loop range value
#we can able to do this same program in while also
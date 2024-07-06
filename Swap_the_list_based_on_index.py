Swap = [567, 687, 456, 32, 53]
print("THE LIST IS ", Swap)

# 1st approach
print("1ST APPROACH ")
Swap[0] = Swap[0] + Swap[1]
Swap[1] = Swap[0] - Swap[1]
Swap[0] = Swap[0] - Swap[1]  # try to execute the code corresponding to the approach no.
print(Swap)

print("2ND APPROACH ")
#2nd approach
#let us assume a tempory varialbe
temp = Swap[1]
Swap[1] = Swap[2]
Swap[2] = temp
print(Swap)

print("3rd APPROACH")
#3rd approach : using tuple
get = (Swap[-1], Swap[0])  # this is call packing in python
#the above line assign like 53,567
Swap[0], Swap[-1] = get
print(Swap)

print("4th APPROCH ")
# this approach is something differ from the other approach using(* operant)
start, *middle, end = Swap
print(Swap)
Swap = [end, middle, start]  #output becomes [53,[687,456,32,567]
print(Swap)

print("5th APPROACH")
#5t approach using pop() (pop function) USING THE (dot)(.) operator
first = Swap.pop(0)
last = Swap.pop(-1)
Swap.insert(0, last)
Swap.append(first)  # append function is  used to  add the element in the end of the list
print(Swap)

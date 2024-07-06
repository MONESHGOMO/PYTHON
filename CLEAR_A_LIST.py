given1=[564,5,345,334,766]
print("given1 list before clear :",given1)
given1.clear()
print("given1 list after clear :",given1 )
print()

# 2nd approach
given2=[564,5,345,334,766,242]
print("given2 list before clear :",given2)
given2=[]
print("given2 list after clear :",given2 )
print()

# 3rd approach
given3=[564,5,345,334,766,242]
print("given3 list before clear :",given3)
given3*=0
print("given3 list after clear :",given3 )
print()

# 4rd approach

given4=[564,5,345,334,766,242]
print("given4 list before clear :",given4)
del given4[:] # delete  all the elements in the  given4
print("given4 list after clear :",given4 )



given=[1,2,3,4,5,126]
n=126
count=0
for i in  range (len(given)):
    if given[i]==n:
        count+=1
    else:
        count+=0
if count==1:
    print("ELEMENT FOUND IN THE GIVEN LIST ")
else:
    print("ELEMENT NOT FOUND IN THE GIVEN LIST  ")

#Using operator

if n in given:
    print("ELEMENT FOUND IN THE GIVEN LIST ")
else:
    print("ELEMENT NOT FOUND  IN THE GIVEN LIST ")

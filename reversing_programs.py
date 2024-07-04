'''        *  REVERSING PROGRAMS *         '''

# REVERSING STRING & PALINDROME

name=input("ENTER YOUR NAME :")
rev_name=(name[::-1])
print(rev_name ," ","is the revered name")

if rev_name==name:
    print("IT IS A PALINDROME NAME")
else:
    print("IT IS NOT A PALINDROME STRING ")
print()




# REVERSING  NUMBER & PALINDROME
num = 121
original_num=num
rev = 0
while num > 0:
    rev = rev * 10 + num % 10
    num = num // 10
print(rev)
if original_num == rev:
    print("IT IS A PALINDROME NUMBER ")
else:
    print("IT IS NOT A PALINDROME NUMBER ")



#table for practice

a=int(input("\n enter the number of reated times="))
for i in range(0,a):
    n=int(input("\n enter the number of table you want="))

    for j in range(1,11):
        mul=n*j
        print("\n tabel for=",n,"*",j,"=",mul)


 
print("\n\n\n\n\n\n")


# other type of for loop

list=[1,2,3,4,5,6,10]
for k in list:
    print(k,end=" ")

print("\n\n\n")    

#another type of the loop

list=[1,2,3,4,5,6,10]
for p in range(0,7):
    print("\n p=",p,"list[p]=",list[p])

print("\n\n\n\n")



#reverse for loop frist
list=[1,2,3,4,5,6,10]
for g in range(len(list)-1,-1,-1):
    print(list[g],end=" ")    #answer=10 6 5 4 3 2 1

print("\n")

for i in range(10,0,-1):
    print(i,end=" ")       #answer=10 9 8 7 6 5 4 3 2 1 

print("\n")
#sorted function 

a=("a","c","b")
x=sorted(a)
print(x)              #answer=['a','b','c']
    




list=[]

size=int(input("\n enter the size of list="))

for i in range(0,size):
    num=int(input("\n enter the number of element="))
    list.append(num)

for i in range(0,size):
    print("\n list=",list[i])


min=list[0]

for i in range(0,size):
    if(list[i]<min):
        min=list[i]

print("\n minimum number of element of list=",min)                
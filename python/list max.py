list=[]
size=int(input("\n enter the size of list="))

for i in range(0,size):
      num=int(input("\n enter the elements of list="))
      list.append(num)
      
for i in range(0,size):
    print("list=",list[i])      

for i in range(0,size):
    if(list[0]<list[i]):
        list[0]=list[i]

print("\n maximum number in the list=",list[0])        
# use append function
companies=[]
companies.append("google")
companies.append("facebook")
companies.append("microsoft")
print("companies=",companies)

# use insert function
stream=["computer","civil","mechanical"]
print("stream=",stream)
print(stream[0],stream[1],stream[2])
stream.insert(2,"elctronics & telocomunication")
print("iserted stream=",stream)

# use extend function
play=["criket","football"]
print("play=",play)
play.extend(["cooding_competation","criminal & police"])
print("extend play=",play)

# use index function
play_index=play.index("cooding_competation")
print("play_index=",play_index)

# use remove function
play.remove("criminal & police")
print("play=",play)

# use pop function

list=[1,2,3,4]
print("list=",list)
list.pop()
print("list=",list)
list.pop(2)
print("list=",list)

# use sort function
number=[4,2,5,1]
print("number=",number)
number.sort()
print("number=",number)

# use reverse function

num=[1,2,3,4]
print("num=",num)
num.reverse()
print("num=",num)
n=len(num)  # length of list
print("length=",n)

#loop over the companies and print both the index as you as the name

for index,name in enumerate(companies):
    print("index is %s for company: %s" %(index,name))

# use loop

numbers=[]
for i in range(0,4):
    n=int(input("enter the elements="))
    numbers.append(n)

for j in range(0,len(numbers)):  # for j in numbers
    print(numbers)  # 4 times loop is repeated with same output

pic=[]
for i in range(0,2):
    m=int(input(" enter the elements="))
    pic.append(m)

for j in pic:
    print(j)

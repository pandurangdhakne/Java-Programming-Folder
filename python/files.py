f=open("pmd.txt","w")
f.write("pandurang mukund dhakne ")
print("\n successfully work")

f=open("pmd.txt","a")
f.write("nikita pandurang dhakne")
print("\n successfully work done")

p=open("pmd.txt","r")
call=p.read()
print(call)


f=open("pmd.txt","w")
f.write("pandurang mukund dhakne ")
print("\n successfully work")

f=open("pmd.txt","w")
list=["i am stay in the aurangabad city in maharastra"]
f.writelines(list)
print("\n successfully stay")

p=open("pmd.txt","r")
call=p.readlines(15)
print(call)
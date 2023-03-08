class Calculator:
    def add(self):
        a=int(input("enter the number:"))
        b=int(input("enter the number:"))
        c=a+b
        print("addition=",c)

    def sub(self):
        a=int(input("enter the number:"))
        b=int(input("enter the number:"))
        c=a-b
        print("subtraction=",c)

    def mul(self):
        a=int(input("enter the number:"))
        b=int(input("enter the number:"))
        c=a*b
        print("multiplecation=",c)

    def div(self):
        a=int(input("enter the number:"))
        b=int(input("enter the number:"))
        c=a/b
        print("divide=",c) 


c1=Calculator()


while(True):

    print("\n 1 for addition \n 2 for substraction \n 3 for multiplecation \n 4 for dividation \n")

    choice=int(input("enter the number of choice:"))


    if choice==1:
        c1.add()
     
    elif choice==2:
        c1.sub()
       
    elif choice==3:
        c1.mul()
      
    elif choice==4:
        c1.div()
        
    else:
        print("\n || program error ||")




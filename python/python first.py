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
c1.add()
c1.sub()
c1.mul()
c1.div()                   
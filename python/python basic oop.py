#first method

class rebel:
    def mini(self,a):
       self.a=a

    def jor(self):
        
        print("\n a=",self.a)


r1=rebel()
r1.mini(2)
r1.jor()            


     


#second method

class kirru:
    def veg(self):
        a=int(input("\n enter the number a="))
        b=int(input("\n enter the number b="))
        self.a=a
        self.b=b

    def nonveg(self):
        print("\n a=",self.a)
        print("\n b=",self.b)    

k1=kirru()
k1.veg()
k1.nonveg()


#third method default constructor

class extra:
    def __init__(self):
        c=2
        d=3
        print("\n **default constructor**")
        print("\n c=",c)
        print("\n d=",d)

e1=extra()



#forth method constructor

class mahol:
    def __init__(self,t,h):
        print("\n  **regular constructor**")
        print("\n t=",t)
        print("\n h=",h)

m1=mahol(2,3) 




#fifth method 

class nikita:
    
    def get(self,name):
        
        print("name=",name)


n1=nikita()
n1.get("nikita patil")


#sixth method

class kiran:
    
    def get(self):
        name=str(input("enter the good friend name="))
        print("good friend name=",name)


k1=kiran()
k1.get()

#seventh method

class nik:
    name="rebel.2000"
    def get(self):
        num=2000
        print("num=",num)


n=nik()
n.get()
print(n.name)




















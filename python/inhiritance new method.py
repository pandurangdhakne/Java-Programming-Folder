class Sab:
    def assign(self):
        str1=str(input("\n enter the string= "))
        print("\n mu crush name is=",str1)
   
s1=Sab()
s1.assign()



class Aa:
    def assign(self,str1):
        print("\n may name is=",str1)

a1=Aa()
a1.assign("pandurang") 



class Bb:
    def assign(self,str1):
        self.str1=str1
    def show(self):
        print("\n name of student=",self.str1)    

b1=Bb()
b1.assign("omkar")
b1.show()            
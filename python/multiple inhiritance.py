class Aa:
    def add(self):
        a=3
        b=5
        c=a+b
        print("\n add=",c)

class Bb():
    def sub(self):
        f=5
        d=2
        k=f-d
        print("\n sub=",k)

class Cc(Aa,Bb):
    def mul(self):
        g=5
        h=5
        l=g*h
        print("\n mul=",l)



c1=Cc()
c1.add()
c1.sub()
c1.mul()
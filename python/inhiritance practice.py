class Vehicle:
    def __init__ (self,milege,cost):
        self.milege=milege
        self.cost=cost
    def show(self):
        print("\n milege=",self.milege)
        print("\n cost=",self.cost)
        print("\n i am the vehicle")

class Car(Vehicle):
    def __init__ (self,milege,cost,speed,name):
        super(). __init__(milege,cost)
        self.milege=milege
        self.cost=cost
        self.speed=speed
        self.name=name
    def display(self):
        print("\n milege=",self.milege)
        print("\n cost=",self.cost)
        print("\n speed=",self.speed)
        print("\n name=",self.name)
        print("\n i am the car")
       

c1=Car(400,40000,220,50)
c1.show()
c1.display()

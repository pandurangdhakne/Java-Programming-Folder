class Vehicle:                                        #parent class
    def __init__(self,milege,cost):
        self.milege=milege
        self.cost=cost
    def show(self):
        print("\n milege=",self.milege)
        print("\n cost=",self.cost)



class Car(Vehicle):                                 #chide class
    def display(self):
        print("\n i am use the car")
            
 
c1=Car(300,600000)
c1.show()
c1.display()


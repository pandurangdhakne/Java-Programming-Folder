class Employee:
    def __init__(self,name,age,salary,gender):  #constructor in python (two underscore use to initiate [__init__] )
        self.name=name
        self.age=age
        self.salary=salary
        self.gender=gender

    def employee_details(self):
        print("\n name of employee is=",self.name)
        print("\n age of employee is=",self.age)
        print("\n salary of employee is=",self.salary)
        print("\n gender of employee is=",self.gender)


e1=Employee('omkar',22,85000,'male')
e1.employee_details()        

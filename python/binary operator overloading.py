# python program illustrate how
# to overload an binary + operator


class A:
    def __init__(self,a):
        self.a=a

     # adding two objects
    def __add__(self,o):
        return self.a + o.a    

obj1=A(7)
obj2=A(3)
print("\n add=",obj1+obj2)        



# next methode for operator overloading
# python program to perform add
# of two complex numbers using + operator overloading

class complex:
    def __init__(self,a,b):
        self.a=a
        self.b=b

        # adding two objects
    def __add__(self,other):
        return self.a + other.a , self.b + other.b

obj1=complex(3,4)
obj2=complex(4,3)
obj3=obj1+obj2
print("\n complex addition=",obj3)



"""
Operator    Magic Methode
+            __add__(self,other)
-           __sub__(self,other)
*            __mul__(self,other)
/            __truediv__(self,other)
//            __flooediv__(self,other)
%            __mod__(self,other)
**            __pow__(self,other)
>>            __rshift__(self,other)
<<            __lshift__(self,other)
&            __and__(self,other)
|            __or__(self,other)
^            __xor__(self,other) 

"""




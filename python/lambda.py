x=lambda a: a+10
print(x(5))   # output 15

print("\n\n\n")



y=lambda c,b: c*b
print(y(10,10))  # output 100

print("\n\n\n")



def myfun(n):
    return lambda a: a*n

mylambda=myfun(20)
print(mylambda(10))    



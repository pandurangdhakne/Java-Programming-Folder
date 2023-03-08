
binary=int(input("\n enter the binary number= "))
decimal=0
base=2


while(binary!=0):

    remainder=binary%10
    binary=binary/10

    decimal+= remainder * base
    base=base * 2 
    

print("\n decimal=",decimal)    
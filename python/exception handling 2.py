a=int(input("enter the first number:"))
b=int(input("enter the second number:"))

try:

    c=a/b
    print("dividation is:",c)

except Exception as e:
    print(e)

print("This line is very important")        

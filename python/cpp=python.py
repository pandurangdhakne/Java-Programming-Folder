class area_len:
    def ar_len(self):

         len=int(input("\n enter the length 1="))
         a=len
         return a

class paramiter:
    def pa_len(self):

         length=int(input("\n enter tne length 2="))
         b=length
         return b


   
class show(area_len,paramiter):
    def sh_len(self):

         print("\n a=",a)
         print("\n b=",b)  


c1=show()
a=c1.ar_len()     
b=c1.pa_len()
c1.sh_len()


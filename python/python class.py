class Ide:
    def get(self,color):
        self.color=color

    def show(self):
       return self.color    


i1=Ide()
i1.get('red')
print(i1.show()) 
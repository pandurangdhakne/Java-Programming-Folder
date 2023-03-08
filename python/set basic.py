# $ HOW TO CREAT SETS
#creating an empty set
setA=set()
print(setA)

# creating a set with a string
#since a string is an iterable,this will succeed
setA=set("pandurang")
print(setA)

# creating a set with a list
setA=set(["c","c++","python"])
print(setA)

#creating a set with a list of numbers
#there are some duplicate in it
setA=set([1,2,2,3,4,5,5,6,7])
print(setA)

#creating a set with a string.The string has some repeated characters
mystring='omkar'
setA=set(mystring)
print(setA)

# $ METHODS TO CHANGE A SET
#how to add elements to a set
setB=set([1,2,3,4,5,6])
setB.add(7)
print(setB)

setB.add( (8,9))
print(setB)

# use update function
setC=set([1,2,3,4,5,6,7,8,9])
print(setC)
setC.update([10,11])
print(setC)

setD=set([1,2,3,4,5])
print(setD)
setD.update([6,7,8,9],[10,11,12,13])
print(setD)

# remove=discard same at the different elements but not same at the same elements
setD.discard(7)
print(setD)
setD.remove(8)
print(setD)

# use copy function
setE=setD.copy()
print(setE)

# use clear function
setD.clear()
print(setD)

# use pop function
setE.pop()
print(setE)

# use intersection method
setF=set()
setF.update([1,2,3,4,5])
setG=set([2,3,5,6,7])
print(setF)
print(setF & setG) #intersection
print(setF.intersection(setG))

# use difference of two set
set1=set([1,2,3,4])
set2=set([1,3,5,6])
print(set1.difference(set2))
print(set2.difference(set1))

#use isdisjoint() method
print(set1.isdisjoint(set2))
set3=set([100,99])
print(set1.isdisjoint(set3))

#use difference_update (-=)
print(set1.difference_update(set2))
print(set1)

#use issubset "<=" proper subset "<"
print(set1.issubset(set2))
print(set1.issuperset(set2))
print(set1 < set2)


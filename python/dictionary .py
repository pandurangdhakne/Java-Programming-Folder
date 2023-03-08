# format dictionary
person_information={"name":"pandurang","city":"aurangabad","roll_no":"205c010"}
print("person_infoemation=",person_information)
print(type(person_information))
print("\n")

# format
print(person_information["name"])
print("\n")

#format with numbers
alphabets={1:"p"}
print("alphabets=",alphabets)
print(alphabets.get(1))
print("\n")

#format looping over dictionary
details={"year":"2nd year","branch":"computer_engineering","college":"scoe"}
for k,v in details.items():
    print("clg key: %s" %k)
    print("clg details: %s" %v)
    print("_____________________________")
print("\n")

 # format add elements to a dictionary
person1_information = {}
person1_information["city"] = "San Francisco"
print(person1_information)
person1_information["name"] = "Sam"
print(person1_information)
person1_information["food"] = "shrimps"
print(person1_information)
print("\n")

# use update function
god={"hanuman":"ram","ganesh":"mahadev"}
print("god=",god)
remaining_warrior={"karn":"surydev","arjun":"indradev"}
god.update(remaining_warrior)
print("god_update-",god)
print("\n")

# use del function
del god["karn"]
del god["arjun"]
print("god list=",god)
print("\n")

# use pop function
person2_information = {'city': 'San Francisco', 'name': 'Sam', "food": "shrimps"}
print(person2_information.pop("food", None))
print(person1_information)
print("\n")



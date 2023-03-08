from access_dict_by_dot import AccessDictByDot
import math
from math import sin
from math import *
import pprint36 as p


information={"name":{"first_name":"pandurang","last_name":"dhakne"},"phone_no":"7758074123"}
information=AccessDictByDot.load(information)
print(information.name.first_name)
print(information.name.last_name)
print(information.phone_no )

n=math.factorial(4)
print(n)
print(math.sqrt(4))
print(log(10))
print(math.sin(0))

n=90
m=99.9
print(p.pprint(n))
print(p.pprint(m))
print(type(information))
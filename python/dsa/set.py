s1={()}
print(type(s1))
#set cannot index or slicee
# set contain is immutable
# to define empty set we use empty set

#set Operator
#creating set 

a={1,2,3,4}
b=set({3,4,5,6})
c=set({1:"sid"})

print("set A",a)
print("set B",b)
print("set C",c)

a.add(10)
print("after adding 10 to A",a)

#update multiple element
a.update([11,12])
print("After updating A with [11,12]:",a)

#remove
a.remove(10)
a.discard(100)

print("after removing 10 and discarding 100:",a)

print("a:",a)
print("b:",b)

#Set union
print("union",a|b)

#set intersection
print("Intersection:", a&b)

#set differnce
print("Differnce a-b:",a-b)

#set symmetric differnce
print("symmetric differnce",a^b)

#subset
print("aa is subset of b:",a.issubset(b))
print("a is superset of b",a.issubset(b))

c=a.copy()
print("copy of a",c)
c.clear()
print("clear set",c)

# s1=set("hello")
# print(s1)

#set from string  & list

s1=set("hello")
s2=set(["apple","banana","apple","cherry"])
print("set from string:",s1)
print("set from list( duplicates remove)",s2)

#membership

my_set={1,2,3,4,5}
print(3 in my_set)
print(10 not in my_set)

#looping through set
for item in my_set:
    print("item",item)


#set comperhension
square ={x**2 for x in range(6)}
print("square set:",square)

random_set={10,20,30}
element = random_set.pop()
print("remove elment",element)
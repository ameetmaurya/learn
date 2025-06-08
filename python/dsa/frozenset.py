#create froxzenset

x=frozenset([1,2,3])
y=frozenset([3,4,5])

print("forzenset X:",x)
print("Frozeset y",y)

#set operations on frozesetsa

print("union",x|y)
print("intersection",x&y)
print("differnce x-y",x-y)
print("symmatic differnce",x^y)

#subset and superset
print("X is subset of y",x.issubset(y))
print("x is suoerset of y",x.issuperset(y))

#membership 
print('y' is frozenset("python"))

#looping through frozenset
for ch in frozenset("freeze"):
    print(ch,end='')
print()

#conversion example

my_list =[1,2,3,4]
my_set=set(my_list)
my_frozenset=frozenset(my_set)
print("list:",my_list)
print("set:",my_set)
print("frozenset:",my_frozenset)

#frozensetr as dictionaty set 
f1=frozenset([1,2])
f2=frozenset([2,3])

frozen_dict={f1:"first",f2:"second"}
print("frozen dict",frozen_dict)

a=frozenset([1,2])
b=frozenset([2,3])
outer_set={a,b}
print("set of frozensets:",outer_set)
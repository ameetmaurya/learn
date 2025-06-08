#build in 
#userdefine
#anonymous function(lamda)

# def func(name):
#     print("hi",name)
# func("Rakesh")

def add(a,b):
    c=a+b
    print("the add is ",a,"and",b,"=",c)
add(2,3)

def add(a,b):
    c=a+b
    return(c)
print("enter 2 number")
x=int(input())
y=int(input())
z=add(x,y)
print("the add is of ",x,"and",y,"=",z)


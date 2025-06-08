# t1=(1,2,3,4,5)
# t2=(3,4,2,1,t1)
# # t2=t1
# # t1[0]=4
# print(t2)

#concatnation
# t1=("ameet","amit")
# t2=t1+(1,2,3,4)
# print(t2)

# #repetation
# t4=("logic,")*3
# print(t4)

# s1=("sid")
# print(type(s1))

# s2="sid","hi"
# print(type(s2))

# t3=["hi man"]
# t4=tuple(t3)
# print(t3)
# print(type(t4))

# s3=("hwllo,hii")
# t5=tuple(s3)
# print(t5)
# print(type(s3))


# tuple take single paameter of list string set dictonary:-only key valueto conver in tuple

#index
# t1=("mimbai","pune","banglore","delhi")
# print(t1.index("banglore"))

# #count
# t2=("mimbai","pune","banglore","delhi")
# print(t1.count("pune"))

# #Enum
# t3=("apple","banana","elelphant")
# for item in enumerate(t3):
#     print(item)

# # t4=("a","b","c","d","h")
# # for 
# l1=[i for i in range(1,11)]
# print(l1)

# # t1=()
# # for i in range(1,11):
# #    t1.append()
# # print(t1)

# import timeit
# print(timeit.timeit("x=(1,2,3,4,5)",number=1000000))
# print(timeit.timeit("x=[1,2,3,4,5]",number=1000000))

# language =('C','java','C++','vb','python','php','25')
# print(language)

# print(max(language))
# print(min(language))
# var=sorted(language)
# print(var)
# val=(1,2,3,4,5,True)
# print(sum(val))

# #tuple are order and dic are unorder
# d1={"sid":"ameet"}
# print(type(d1))

# d2={"sid":3,"":"ameet"}
# print(d2[""])

# dict={'d1':{1:"Programmer"},'d2':{'language':"pyuthon",'d3':{'name':'sidhant'}}}

# print(dict['d1'])
# print(dict['d1'][1])
# print(dict['d2']['language'])
# print(dict['d2']['d3']['name'])

# dict1={}
# print(dict1)

# #adding an elements to dictionary
# dict1[0]='hi'
# dict1[2]='python'
# dict1[3]='Coders'
# print("Dictiopnary after adding an elements:",dict1)

# Dict['value_set']=2,3,4
# print("afet adding set valures:",Dict)

#methods

#get mehtod
# dic1={"a":1,"B":2}
# print(dic1.get("a"))

# #pop
# dic2={"a":1,"B":2,"c":4}

# dic2.pop("a")
# print(dic2)

# #del
# # dic1={}
# del dic1["a"]
# print(dic1)

# lang1={1:'c',2:'C++',3:'Java',4:'python'}
# lang2={5:'vb',6:'forton'}
# lang1.update(lang2)
# print(lang1)


# b_dic={}
# a_dict={'one':1,'two':2,'three':3,'four':4}
# for key,value in a_dict.items():
#     b_dic[value]=key
# print(b_dic)

#dic comprenstion

# d1={k:v for(k,v)in d1.items()}

dic1={"a":1,"b":2,"c":3}
d1={k:v for(k,v) in dic1.items() if  v>2}
print(d1)

dic2={"a":1,"b":2,"c":3,"d":4,"e":5}
d2={k:v for(k,v) in dic1.items() if v%1==0}
print(d2)

dic3 ={"a":1,"b":2,"c":3,"d":4,"e":5}
d4={k:("even" if v%2==0 else "odd") for k,v in dic3.items()}
print(d4)



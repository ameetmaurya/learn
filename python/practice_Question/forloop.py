# acc_no=int(input("acc number:"))
# name=str(input("enter name"))
# gender=str(input("enter gendar"))
# age=int(input("enter age"))
# balance =int(input("enter balance"))

# if age<60:
#     if gender=='male':
#      interest= balance*(0.4)*1
#      total_bal= balance+interest
  
#     if gender=='female':
#         interest=balance*(0.5)*1
#         total_bal= balance+interest

# else:
#      interest=balance*(1.7)*1
#      total_bal=balance+interest
        
# print("enter the details:")
    
    
# print("Total balace:",total_bal)
# print("interest:",interest)
# name=str(input("Enter your name:"))
# w=int(input("enter your weight:"))
# h=float(input("Enter your height "))

# bmi=w/(h*2)
# if bmi <18.5:
#     print("Name:",name)
#     print("BMI",bmi,"you are underweight")
# if bmi >18.5 and bmi<24.9:
#     print("Name:",name)
#     print("BMI",bmi,"you are normal")
# if bmi >25 and  bmi<29.5:
#     print("Name:",name)
#     print("BMI",bmi,"you are overweight")
# if bmi>=30:
#     print("Name:",name)
#     print("BMI",bmi,"you are obeses")



#Deep copy
# l1=["a","v","t","b","z"]
# l2 = l1
# l2.append(l1)
# print("orginal list",l1)
# print("new list",l2)
# print(id(l1))
# print(id(l2))

#shallow
# l1=["a","v","t","b","z"]
# l2 = l1.copy()
# l2.append("sid")
# print("orginal list",l1)
# print("new list",l2)
# print(id(l1))
# print(id(l2))

# for loop
l1=[ ]
for i in range(1,11):
  l1.append(2*i)
print(l1)

l1=[2*i for i in range(1,11)if(i%2==0)]
print(l1)

# l1 = [ logic +loop+conditional stmt]  underatanding
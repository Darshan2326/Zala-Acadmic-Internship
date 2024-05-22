class MyClass:
    static_var = 10

obj = MyClass()
print("Original value of static variable:", obj.static_var)  

obj.static_var = 20

print("Value of static variable accessed through the class:", MyClass.static_var)  
print("Value of static variable accessed through an instance:", obj.static_var)  

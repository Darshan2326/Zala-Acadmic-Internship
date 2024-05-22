class MyClass:
    static_var = 10
    
    @staticmethod
    def access_static_var():
        return MyClass.static_var

print("Value of static variable:", MyClass.static_var)  

print("Value of static variable accessed through a method:", MyClass.access_static_var()) 

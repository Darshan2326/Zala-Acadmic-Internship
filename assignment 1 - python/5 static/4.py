class MyClass:
    static_var = 10  
    @staticmethod
    def change_static_var(new_value):
        MyClass.static_var = new_value  

print("Original value of static variable:", MyClass.static_var)  
MyClass.change_static_var(20)

print("New value of static variable:", MyClass.static_var) 

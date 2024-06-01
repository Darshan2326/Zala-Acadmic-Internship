class A:
    def method1(self):
        print("Method1 from Class A")

    def method2(self):
        print("Method2 from Class A")

    def common_method(self):
        print("Common method from Class A")

class B(A):  
    def method3(self):
        print("Method3 from Class B")

    def method4(self):
        print("Method4 from Class B")

    def common_method(self):  
        print("Common method from Class B")

class C(B): 
    def method5(self):
        print("Method5 from Class C")

    def method6(self):
        print("Method6 from Class C")

    def common_method(self):  
        print("Common method from Class C")

def main():
   
    obj_a = A()
    obj_b = B()
    obj_c = C()

    print("Calling methods using Class A object:")
    obj_a.method1()
    obj_a.method2()
    obj_a.common_method()  

    print("\nCalling methods using Class B object:")
    obj_b.method1()  
    obj_b.method2()  
    obj_b.method3()  
    obj_b.method4()  
    obj_b.common_method()  

    print("\nCalling methods using Class C object:")
    obj_c.method2()  
    obj_c.method1()  
    obj_c.method3()  
    obj_c.method4() 
    obj_c.method5()  
    obj_c.method6()  
    obj_c.common_method()  

    print("\nCalling overridden method with superclass reference to B and C class's objects:")
    obj_a_ref_to_b = obj_b
    obj_a_ref_to_c = obj_c

    obj_a_ref_to_b.common_method() 
    obj_a_ref_to_c.common_method() 

if __name__ == "__main__":
    main()

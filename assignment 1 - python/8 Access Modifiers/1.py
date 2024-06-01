class A:
    def __init__(self):
        self.__private_field = "I am private"
    
    def __private_method(self):
        print("This is a private method")
    
    def print_private(self):
        print(self.__private_field)
        self.__private_method()

class B(A):
    def access_private(self):
        try:
            print(self.__private_field)
        except AttributeError:
            print("Cannot access private field directly")
        
        try:
            self.__private_method()
        except AttributeError:
            print("Cannot access private method directly")
        
        print(self._A__private_field)
        self._A__private_method()

def main():
    obj_a = A()
    print("Accessing private fields and method from class A:")
    obj_a.print_private()  
    
    obj_b = B()
    print("\nTrying to access private fields and methods from subclass B:")
    obj_b.access_private()  

if __name__ == "__main__":
    main()

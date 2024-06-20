class MyClass:
    def __init__(self, arg1=None, arg2=None):
        if arg1 is None and arg2 is None:
            print("Default constructor called.")
        elif arg2 is None:
            print(f"One-argument constructor called with arg1={arg1}.")
        else:
            print(f"Two-argument constructor called with arg1={arg1}, arg2={arg2}.")

class Main:
    @staticmethod
    def main():
        # Call default constructor
        obj1 = MyClass()
        
        # Call one-argument constructor
        obj2 = MyClass("Hello")
        
        # Call two-argument constructor
        obj3 = MyClass("Hello", "World")

if __name__ == "__main__":
    Main.main()

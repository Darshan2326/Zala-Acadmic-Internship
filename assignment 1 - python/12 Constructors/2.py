class SuperClass:
    def __init__(self, arg1=None, arg2=None):
        if arg1 is None and arg2 is None:
            print("Default constructor of SuperClass called.")
        elif arg2 is None:
            print(f"One-argument constructor of SuperClass called with arg1={arg1}.")
        else:
            print(f"Two-argument constructor of SuperClass called with arg1={arg1}, arg2={arg2}.")

class SubClass(SuperClass):
    def __init__(self, arg1=None, arg2=None):
        if arg1 is None and arg2 is None:
            print("Default constructor of SubClass called.")
            super().__init__()
        elif arg2 is None:
            print(f"One-argument constructor of SubClass called with arg1={arg1}.")
            super().__init__(arg1)
        else:
            print(f"Two-argument constructor of SubClass called with arg1={arg1}, arg2={arg2}.")
            super().__init__(arg1, arg2)

class Main:
    @staticmethod
    def main():
        # Call default constructor
        print("Creating obj1:")
        obj1 = SubClass()
        
        # Call one-argument constructor
        print("\nCreating obj2:")
        obj2 = SubClass("Hello")
        
        # Call two-argument constructor
        print("\nCreating obj3:")
        obj3 = SubClass("Hello", "World")

# Run the main class
if __name__ == "__main__":
    Main.main()

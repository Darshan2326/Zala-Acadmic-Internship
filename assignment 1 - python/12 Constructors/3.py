class SuperClass:
    def __init__(self):
        print("Public constructor of SuperClass called.")

    def _protected_constructor(self):
        print("Protected constructor of SuperClass called.")
    
    def __private_constructor(self):
        print("Private constructor of SuperClass called.")

class SubClass(SuperClass):
    def __init__(self):
        print("Constructor of SubClass called.")
        super().__init__()  # Call the public constructor of SuperClass
        super()._protected_constructor()  # Call the protected constructor of SuperClass
        
        # Attempt to call private constructor (This will fail)
        try:
            super().__private_constructor()
        except AttributeError as e:
            print(f"Cannot call private constructor: {e}")

# Run the code
if __name__ == "__main__":
    obj = SubClass()

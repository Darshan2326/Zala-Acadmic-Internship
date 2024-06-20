class Person:
    def __init__(self, name, age):
        self.name = name  # Initialize the 'name' attribute
        self.age = age    # Initialize the 'age' attribute
        print(f"Constructor called for {self.name}, age {self.age}")

    def display(self):
        print(f"Name: {self.name}, Age: {self.age}")

# Create instances of the Person class
person1 = Person("Alice", 30)
person2 = Person("Bob", 25)

# Access and display the attributes
person1.display()
person2.display()

# Modify the attributes
person1.name = "Alicia"
person1.age = 31
person1.display()

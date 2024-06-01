from abc import ABC, abstractmethod

class AbstractClassExample(ABC):
    def __init__(self, value):
        self.value = value

    @abstractmethod
    def abstract_method(self):
        pass  

    def non_abstract_method(self):
        print(f"This is a non-abstract method. Value: {self.value}")

class ConcreteClassExample(AbstractClassExample):
    def abstract_method(self):
        print(f"Implementation of abstract method. Value: {self.value}")

    def create_and_use_abstract_class_instance(self):
    
        instance = ConcreteClassExample(self.value)
        instance.non_abstract_method()


def main():
    # Instantiate the concrete class
    concrete_instance = ConcreteClassExample(10)
     
    concrete_instance.create_and_use_abstract_class_instance()

if __name__ == "__main__":
    main()

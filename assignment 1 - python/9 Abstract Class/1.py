from abc import ABC, abstractmethod

class AbstractClassExample(ABC):
    def __init__(self, value):
        self.value = value

    @abstractmethod
    def abstract_method(self):
        pass  # Abstract method, must be implemented by subclasses

    def non_abstract_method(self):
        print(f"This is a non-abstract method. Value: {self.value}")

class ConcreteClassExample(AbstractClassExample):
    def abstract_method(self):
        print(f"Implementation of abstract method. Value: {self.value}")

def main():

    concrete_instance = ConcreteClassExample(10)
    concrete_instance.abstract_method()
    
    concrete_instance.non_abstract_method()

if __name__ == "__main__":
    main()

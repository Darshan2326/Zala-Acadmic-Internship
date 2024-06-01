from second.parent import Parent
from second.other import OtherClass
from second.child import Child

def main():
    # Accessing protected fields and methods from the same package
    parent = Parent()
    parent.access_protected()

    other = OtherClass()
    print("\nAccessing protected fields and methods from another class in the same package:")
    other.access_protected_from_parent()

    # Accessing protected fields and methods from a subclass in a different package
    child = Child()
    print("\nAccessing protected fields and methods from a subclass in a different package:")
    child.access_protected_from_child()

if __name__ == "__main__":
    main()

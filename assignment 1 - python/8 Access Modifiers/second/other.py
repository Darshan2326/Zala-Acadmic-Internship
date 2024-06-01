from .parent.py import Parent

class OtherClass:
    def access_protected_from_parent(self):
        parent = Parent()
        print(parent._protected_field)
        parent._protected_method()

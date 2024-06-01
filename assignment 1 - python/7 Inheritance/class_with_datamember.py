class A:
    def __init__(self):
        self.data = "Data from Class A"

    def show_data(self):
        print(self.data)

class B(A): 
    def __init__(self):
        super().__init__()
        self.data = "Data from Class B"

    def show_data(self):
        print(self.data)

class C(B):
    def __init__(self):
        super().__init__()
        self.data = "Data from Class C"

    def show_data(self):
        print(self.data)

# Main method to create instances and demonstrate data member usage
def main_data():
    obj_a = A()
    obj_b = B()
    obj_c = C()

    print("Showing data using Class A object:")
    obj_a.show_data()

    print("\nShowing data using Class B object:")
    obj_b.show_data()

    print("\nShowing data using Class C object:")
    obj_c.show_data()

    print("\nShowing data with superclass reference to B and C class's objects:")
    obj_a_ref_to_b = obj_b
    obj_a_ref_to_c = obj_c

    obj_a_ref_to_b.show_data()  # Should show data from Class B
    obj_a_ref_to_c.show_data()  # Should show data from Class C

if __name__ == "__main__":
    main_data()

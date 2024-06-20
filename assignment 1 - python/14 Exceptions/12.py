class SampleClass:
    def __init__(self):
        self.existing_field = "This field exists"

def generate_no_such_field_exception():
    obj = SampleClass()
    print(obj.non_existent_field)  # This will cause an AttributeError

generate_no_such_field_exception()

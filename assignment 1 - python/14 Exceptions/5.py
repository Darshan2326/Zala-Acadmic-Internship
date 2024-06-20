def throw_custom_exception():
    raise ValueError("This is a custom exception message")

try:
    throw_custom_exception()
except ValueError as e:
    print(f"Caught an exception: {e}")

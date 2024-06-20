def handle_arithmetic_exception():
    try:
        result = 10 / 0
    except ZeroDivisionError as e:
        print(f"Caught an exception: {e}")

handle_arithmetic_exception()

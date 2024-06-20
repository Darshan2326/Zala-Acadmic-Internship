def multiple_catch_blocks():
    try:
        result = 10 / 0
    except ZeroDivisionError as e:
        print(f"Caught ZeroDivisionError: {e}")
    except ValueError as e:
        print(f"Caught ValueError: {e}")

multiple_catch_blocks()

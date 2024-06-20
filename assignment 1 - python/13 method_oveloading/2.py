class Processor:
    def process(self, arg1, arg2=None):
        if isinstance(arg1, int) and arg2 is None:
            print(f"Processing single integer: {arg1}")
            return arg1 * arg1
        elif isinstance(arg1, str) and isinstance(arg2, str):
            print(f"Concatenating two strings: {arg1} and {arg2}")
            return arg1 + arg2
        else:
            print("Unsupported types or number of arguments.")
            return None

class Main:
    @staticmethod
    def main():
        proc = Processor()
        
        # Call method with one integer argument
        result1 = proc.process(5)
        print(f"Result: {result1}")
        
        # Call method with two string arguments
        result2 = proc.process("Hello", "World")
        print(f"Result: {result2}")
        
        # Call method with unsupported argument types
        result3 = proc.process(5, "World")
        print(f"Result: {result3}")

# Run the main class
if __name__ == "__main__":
    Main.main()

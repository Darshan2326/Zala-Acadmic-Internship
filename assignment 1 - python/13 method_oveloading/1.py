class Calculator:
    def calculate(self, *args):
        if len(args) == 1:
            print(f"Calculating the square of {args[0]}:")
            return args[0] * args[0]
        elif len(args) == 2:
            print(f"Calculating the sum of {args[0]} and {args[1]}:")
            return args[0] + args[1]
        else:
            print("Unsupported number of arguments.")
            return None

class Main:
    @staticmethod
    def main():
        calc = Calculator()
        
        # Call method with one argument
        result1 = calc.calculate(5)
        print(f"Result: {result1}")
        
        # Call method with two arguments
        result2 = calc.calculate(5, 10)
        print(f"Result: {result2}")
        
        # Call method with unsupported number of arguments
        result3 = calc.calculate(5, 10, 15)
        print(f"Result: {result3}")

# Run the main class
# if __name__ == "__main__":
Main.main()

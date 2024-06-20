class Calculator:
    def calculate(self, a, b, operation):
        if operation == 'sum':
            return self._sum(a, b)
        elif operation == 'product':
            return self._product(a, b)
        else:
            print("Unsupported operation.")
            return None
    
    def _sum(self, a, b):
        return a + b
    
    def _product(self, a, b):
        return a * b

class Main:
    @staticmethod
    def main():
        calc = Calculator()
        
        # Call method to sum two numbers
        result1 = calc.calculate(5, 10, 'sum')
        print(f"Sum: {result1}")
        
        # Call method to multiply two numbers
        result2 = calc.calculate(5, 10, 'product')
        print(f"Product: {result2}")
        
        # Call method with unsupported operation
        result3 = calc.calculate(5, 10, 'subtract')
        print(f"Result: {result3}")

# Run the main class
if __name__ == "__main__":
    Main.main()

class ArrayUtils:
    @staticmethod
    def find_second_largest(arr):
        if len(arr) < 2:
            return "Array should have at least two elements"
        
        largest = max(arr[0], arr[1])
        second_largest = min(arr[0], arr[1])
        
        for num in arr:
            if num > largest:
                second_largest = largest
                largest = num
            elif num > second_largest and num != largest:
                second_largest = num
        
        return second_largest

# Example usage
arr = [1, 5, 2, 6, 4]
second_largest = ArrayUtils.find_second_largest(arr)
print("Second largest number:", second_largest)  # Output: 5

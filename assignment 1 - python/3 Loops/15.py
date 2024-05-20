class ArrayUtils:
    @staticmethod
    def count_even_odd(arr):
        even_count = 0
        odd_count = 0
        
        for num in arr:
            if num % 2 == 0:
                even_count += 1
            else:
                odd_count += 1
        
        return even_count, odd_count

arr = [1, 2, 3, 4, 5, 6]
even_count, odd_count = ArrayUtils.count_even_odd(arr)
print("Number of even numbers:", even_count)  # Output: 3
print("Number of odd numbers:", odd_count)   # Output: 3

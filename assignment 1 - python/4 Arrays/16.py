def difference_largest_smallest(arr):
    if not arr:
        return "Array is empty"
    
    min_val = min(arr)
    max_val = max(arr)
    
    return max_val - min_val

arr = [1, 5, 2, 6, 4]
result = difference_largest_smallest(arr)
print("Difference between largest and smallest value:", result)  # Output: 5

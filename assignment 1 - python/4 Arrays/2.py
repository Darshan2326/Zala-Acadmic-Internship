def average_array(arr):
    if not arr:
        return 0
    
    total = sum(arr)
    return total / len(arr)
array = [1, 2, 3, 4, 5]
result = average_array(array)
print("Average of array:", result)

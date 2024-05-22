def sum_array(arr):
    total = 0
    for num in arr:
        if isinstance(num, int):
            total += num
    return total

array = [1, 2, 3, 4, 5,6]
result = sum_array(array)
print("Sum of array:", result)

def find_min_max(arr):

    minimum = min(arr)
    maximum = max(arr)
    return minimum, maximum

array = [3, 7, 1, 9, 5]
minvalue, maxvalue = find_min_max(array)
print("Minimum value:", minvalue)
print("Maximum value:", maxvalue)

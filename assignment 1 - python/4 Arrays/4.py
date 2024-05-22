def contains_value(value, arr):

    return arr in value

array = [1, 2, 3, 4, 5]
check = 5
if contains_value(array, check):
    print(f"The array contains {check}.")
else:
    print(f"The array does not contain {check}.")

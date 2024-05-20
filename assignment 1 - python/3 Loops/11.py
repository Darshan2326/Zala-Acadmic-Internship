def find_common(arr1, arr2):
    set1 = set(arr1)
    set2 = set(arr2)

    common_values = set1.intersection(set2)

    return list(common_values)

array1 = [1, 2, 3, 4, 5]
array2 = [3, 4, 5, 6, 7]
common_values = find_common(array1, array2)
print("Common values:", common_values)

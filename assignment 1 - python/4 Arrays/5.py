def remove_element(arr, element):

    if element in arr:
        arr.remove(element)
    return arr

array = [1, 2, 3, 4, 5]
remove = 3
updated_array = remove_element(array, remove)
print("Updated array after removing element:", updated_array)

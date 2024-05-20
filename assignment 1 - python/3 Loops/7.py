def insert_element(arr, element, position):
   
    arr.insert(position, element)
    return arr

# Example usage:
array = [1, 2, 3, 5]
elementToinsert = 4
positionToinsert = 3
updated_array = insert_element(array, elementToinsert, positionToinsert)
print("Updated array after inserting element:", updated_array)

def remove_duplicates(arr):
    return list(set(arr))

arr = [1, 2, 3, 4, 2, 3, 5]
new_arr = remove_duplicates(arr)
print("New array after removing duplicates:", new_arr) 

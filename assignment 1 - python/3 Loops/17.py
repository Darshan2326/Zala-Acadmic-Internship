class ArrayUtils:
    @staticmethod
    def contains_elements(arr):
        return 12 in arr and 23 in arr

arr = [1, 5, 12, 6, 23, 4]
contains_specified_elements = ArrayUtils.contains_elements(arr)
print("Array contains both specified elements (12, 23):", contains_specified_elements)

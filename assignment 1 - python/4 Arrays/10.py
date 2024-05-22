def find_duplicates(arr):
    freq = {}
    duplicates = []

    for item in arr:
        if item in freq:
            freq[item] += 1
        else:
            freq[item] = 1

    for key, value in freq.items():
        if value > 1:
            duplicates.append(key)

    return duplicates

array = [1, 2, 3, 4, 4, 5, 6, 6, 7, 8, 8, 9]
print("Duplicate values:", find_duplicates(array))

# Creating a dictionary with student IDs as keys and names as values
student_dict = {
    101: "Alice",
    102: "Bob",
    103: "Charlie",
    104: "David",
    105: "Eve"
}

# 1.1. Adding values in dictionary
student_dict[106] = "Frank"
print(student_dict)



# 1.2. Updating values in dictionary
student_dict[104] = "Daniel"
print(student_dict)


# 1.3. Accessing the value in dictionary
print(student_dict[103])  # Accessing value for key 103


# 1.4. Create a nested loop dictionary
nested_dict = {
    'Alice': {'Math': 90, 'Science': 85},
    'Bob': {'Math': 88, 'Science': 92},
    'Charlie': {'Math': 95, 'Science': 89}
}

print(nested_dict)


# 1.5. Accessing the values of nested loop dictionary
print(nested_dict['Alice']['Math'])  # Accessing Alice's Math score
print(nested_dict['Bob']['Science'])  # Accessing Bob's Science score


# 1.6. Print the keys present in a particular dictionary
print(student_dict.keys())


# 1.7. Delete a value from a dictionary
del student_dict[105]
print(student_dict)

string = "Ramani Darshan"

# startsWith()
print(string.startswith("Ramani"))  # Output: True

# endsWith()
print(string.endswith("Darshan"))  # Output: True

# compareTo() (using comparison operators)
str1 = "abc"
str2 = "def"
if str1 < str2:
    print(f"{str1} comes before {str2}")  # Output: abc comes before def
elif str1 > str2:
    print(f"{str1} comes after {str2}")
else:
    print("Strings are equal")

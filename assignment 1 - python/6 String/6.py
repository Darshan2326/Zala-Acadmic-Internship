import re

pattern = 'Hello'
string = "Hello World"
match = re.match(pattern, string)
if match:
    print("Matched")  # Output: Matched
else:
    print("Not Matched")

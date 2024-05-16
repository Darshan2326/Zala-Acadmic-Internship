# Define a global variable
G_varable = "This is Global variable"

def my_function():
    # Define a local variable with the same name as the global variable
    L_variable = "this is Local variable"
    print("Inside the function:", L_variable)

# Call the function
my_function()

# Print the global variable
print("Outside the function:", G_varable)

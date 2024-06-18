import os

def check_file_permissions(file_path):
    # Check if the file exists
    if not os.path.isfile(file_path):
        print(f"File not found: {file_path}")
        return

    # Check read permission
    has_read_permission = os.access(file_path, os.R_OK)
    if has_read_permission:
        print(f"File '{file_path}' has read access.")
    else:
        print(f"File '{file_path}' does not have read access.")

    # Check write permission
    has_write_permission = os.access(file_path, os.W_OK)
    if has_write_permission:
        print(f"File '{file_path}' has write access.")
    else:
        print(f"File '{file_path}' does not have write access.")

# Example usage
file_path = 'E:\\internship\\ZALA\\PPYTHON\\ASSIGNMENTS\\assignment 1 - python\\11 files\\example.txt'  # specify the file you want to check
check_file_permissions(file_path)

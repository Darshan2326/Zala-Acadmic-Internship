public class StringExamples {

    public static void main(String[] args) {
        // 1. Different ways creating a string
        String str1 = "Jala";
        String str2 = new String("Acadmy");
        char[] charArray = {'J', 'a', 'v', 'a'};
        String str3 = new String(charArray);
        System.out.println("******** Different ways of creating a string ********");
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

        // 2. Concatenating 
        String concatenated = str1 + " " + str2;
        System.out.println("\nConcatenated string: " + concatenated);

        // 3. Finding the length
        int length = concatenated.length();
        System.out.println("\nLength of concatenated string: " + length);

        // 4. Extract a string 
        String substring = concatenated.substring(6);
        System.out.println("\nExtracted substring: " + substring);

        // 5. Searching in strings using indexOf()
        int index = concatenated.indexOf("World");
        System.out.println("\nIndex of 'World': " + index);

        // 6. Matching a String Against a Regular Expression With matches()
        boolean matches = concatenated.matches(".*World.*");
        System.out.println("\nDoes the string contain 'World'? " + matches);

        // 7. Comparing strings using the methods equals()
        boolean equals = str1.equals("Hello");
        System.out.println("\nstr1 equals 'Hello': " + equals);

        // 8. equalsIgnoreCase(), startsWith(), endsWith() and compareTo()
        boolean equalsIgnoreCase = str1.equalsIgnoreCase("hello");
        boolean startsWith = concatenated.startsWith("Hello");
        boolean endsWith = concatenated.endsWith("World");
        int compareTo = str1.compareTo(str2);
        System.out.println("\nEqualsIgnoreCase: " + equalsIgnoreCase);
        System.out.println("StartsWith 'Hello': " + startsWith);
        System.out.println("EndsWith 'World': " + endsWith);
        System.out.println("CompareTo 'World': " + compareTo);

        // 9. Trimming strings with trim()
        String strWithSpaces = "   Hello World   ";
        String trimmed = strWithSpaces.trim();
        System.out.println("\nTrimmed string: '" + trimmed + "'");

        // 10. Replacing characters in strings with replace()
        String replaced = concatenated.replace('o', 'a');
        System.out.println("\nString after replace: " + replaced);

        // 11. Splitting strings with split()
        String[] splitArray = concatenated.split(" ");
        System.out.println("\nSplit string:");
        for (String s : splitArray) {
            System.out.println(s);
        }

        // 12. Converting Numbers to Strings with valueOf()
        int number = 100;
        String numberStr = String.valueOf(number);
        System.out.println("\nConverted number to string: " + numberStr);

        // 13. Converting integer objects to Strings
        Integer integerObject = 200;
        String integerStr = integerObject.toString();
        System.out.println("\nConverted integer object to string: " + integerStr);

        // 14. Converting to uppercase and lowercase
        String upper = concatenated.toUpperCase();
        String lower = concatenated.toLowerCase();
        System.out.println("\nUppercase: " + upper);
        System.out.println("Lowercase: " + lower);
    }
}

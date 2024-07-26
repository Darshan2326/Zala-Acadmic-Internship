public class Palindrome {
    
    public static void main(String[] args) {
        String str = "madonna", reverseStr = "";
        int strLength = str.length();
        
        for (int i = (strLength - 1); i >= 0; --i) {
            reverseStr += str.charAt(i);
        }
        
        if (str.equals(reverseStr)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
}

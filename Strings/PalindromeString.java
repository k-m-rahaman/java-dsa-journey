public class PalindromeString {

    public static void main(String[] args) {

        String str = "madam";

        String reversed = "";

        for(int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        if(str.equals(reversed)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
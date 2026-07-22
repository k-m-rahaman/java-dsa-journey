import java.util.Stack;

public class ReverseString {

    public static String reverse(String str) {

        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            stack.push(ch);
        }

        StringBuilder reversed = new StringBuilder();

        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        return reversed.toString();
    }

    public static void main(String[] args) {

        String text = "Java DSA";

        System.out.println("Original String : " + text);

        System.out.println("Reversed String: " + reverse(text));
    }
}
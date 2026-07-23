import java.util.Stack;

public class InfixToPostfix {

    static int precedence(char ch) {

        switch (ch) {

            case '+':
            case '-':
                return 1;

            case '*':
            case '/':
                return 2;

            case '^':
                return 3;
        }

        return -1;
    }

    public static String convert(String expression) {

        StringBuilder result = new StringBuilder();

        Stack<Character> stack = new Stack<>();

        for (char ch : expression.toCharArray()) {

            if (Character.isLetterOrDigit(ch)) {

                result.append(ch);
            }

            else if (ch == '(') {

                stack.push(ch);
            }

            else if (ch == ')') {

                while (!stack.isEmpty() && stack.peek() != '(')
                    result.append(stack.pop());

                stack.pop();
            }

            else {

                while (!stack.isEmpty() &&
                        precedence(ch) <= precedence(stack.peek())) {

                    result.append(stack.pop());
                }

                stack.push(ch);
            }
        }

        while (!stack.isEmpty())
            result.append(stack.pop());

        return result.toString();
    }

    public static void main(String[] args) {

        String infix = "A+B*C";

        System.out.println("Infix : " + infix);

        System.out.println("Postfix : " + convert(infix));
    }
}
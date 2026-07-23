import java.util.Stack;

public class PostfixEvaluation {

    public static int evaluate(String expression) {

        Stack<Integer> stack = new Stack<>();

        for (char ch : expression.toCharArray()) {

            if (Character.isDigit(ch)) {

                stack.push(ch - '0');
            }

            else {

                int b = stack.pop();

                int a = stack.pop();

                switch (ch) {

                    case '+':
                        stack.push(a + b);
                        break;

                    case '-':
                        stack.push(a - b);
                        break;

                    case '*':
                        stack.push(a * b);
                        break;

                    case '/':
                        stack.push(a / b);
                        break;
                }
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {

        String postfix = "23*54*+9-";

        System.out.println("Result = " + evaluate(postfix));
    }
}
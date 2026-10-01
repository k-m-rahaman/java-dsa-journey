// Division can be simulated using left shifts.

// Instead of repeatedly subtracting the divisor one time, we find the largest shifted divisor that can fit into the dividend.

public class DivideWithoutDivision {

    static int divide(int dividend, int divisor) {

        if (divisor == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }

        boolean negative = (dividend < 0) ^ (divisor < 0);

        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);

        int result = 0;

        while (a >= b) {

            long current = b;
            int multiple = 1;

            while ((current << 1) <= a) {
                current <<= 1;
                multiple <<= 1;
            }

            a -= current;
            result += multiple;
        }

        return negative ? -result : result;
    }

    public static void main(String[] args) {

        int dividend = 43;
        int divisor = 5;

        System.out.println("Quotient: " + divide(dividend, divisor));
    }
}
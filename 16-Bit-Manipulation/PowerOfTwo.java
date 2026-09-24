public class PowerOfTwo {

    static boolean isPowerOfTwo(int number) {

        if (number <= 0) {
            return false;
        }

        return (number & (number - 1)) == 0;
    }

    public static void main(String[] args) {

        int number = 32;

        System.out.println(
                number + " is power of two: "
                        + isPowerOfTwo(number)
        );
    }
}
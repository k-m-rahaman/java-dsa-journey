public class OddEvenCheck {

    static boolean isEven(int number) {

        return (number & 1) == 0;
    }

    public static void main(String[] args) {

        int number = 17;

        if (isEven(number)) {
            System.out.println(number + " is even");
        } else {
            System.out.println(number + " is odd");
        }
    }
}
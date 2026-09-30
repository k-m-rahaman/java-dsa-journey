public class UpdateBit {

    static int updateBit(int number, int position, int value) {

        // Clear the bit
        number = number & ~(1 << position);

        // Set the bit if value is 1
        number = number | (value << position);

        return number;
    }

    public static void main(String[] args) {

        int number = 10; // 1010

        int result = updateBit(number, 2, 0);

        System.out.println("After updating bit: " + result);
    }
}
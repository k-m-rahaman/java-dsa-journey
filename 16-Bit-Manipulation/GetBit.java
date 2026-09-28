public class GetBit {

    static int getBit(int number, int position) {
        return (number >> position) & 1;
    }

    public static void main(String[] args) {

        int number = 10; // 1010

        System.out.println("Bit at position 1: " + getBit(number, 1));
        System.out.println("Bit at position 2: " + getBit(number, 2));
    }
}
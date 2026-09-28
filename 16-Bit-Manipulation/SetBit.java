public class SetBit {

    static int setBit(int number, int position) {
        return number | (1 << position);
    }

    public static void main(String[] args) {

        int number = 8; // 1000

        int result = setBit(number, 1);

        System.out.println("After setting bit: " + result);
    }
}
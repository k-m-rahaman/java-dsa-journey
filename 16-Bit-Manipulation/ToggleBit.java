public class ToggleBit {

    static int toggleBit(int number, int position) {
        return number ^ (1 << position);
    }

    public static void main(String[] args) {

        int number = 10; // 1010

        int result = toggleBit(number, 1);

        System.out.println("After toggling bit: " + result);
    }
}
public class ClearBit {

    static int clearBit(int number, int position) {
        return number & ~(1 << position);
    }

    public static void main(String[] args) {

        int number = 10; // 1010

        int result = clearBit(number, 1);

        System.out.println("After clearing bit: " + result);
    }
}

public class CountSetBits {

    static int countSetBits(int number) {

        int count = 0;

        while (number != 0) {

            number = number & (number - 1);

            count++;
        }

        return count;
    }

    public static void main(String[] args) {

        int number = 13;

        System.out.println(
                "Number of set bits: "
                        + countSetBits(number)
        );
    }
}
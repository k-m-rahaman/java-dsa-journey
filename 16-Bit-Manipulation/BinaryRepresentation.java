
public class BinaryRepresentation {

    static String toBinary(int number) {

        if (number == 0) {
            return "0";
        }

        StringBuilder binary = new StringBuilder();

        while (number > 0) {

            int bit = number & 1;

            binary.append(bit);

            number = number >> 1;
        }

        return binary.reverse().toString();
    }

    public static void main(String[] args) {

        int number = 25;

        System.out.println(
                "Binary of " + number + ": "
                        + toBinary(number)
        );
    }
}
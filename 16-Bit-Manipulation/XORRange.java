// Find XOR of all numbers from 1 to n.

// The XOR pattern repeats every four numbers:

// n % 4 = 0 → n
// n % 4 = 1 → 1
// n % 4 = 2 → n + 1
// n % 4 = 3 → 0

public class XORRange {

    static int xorFromOne(int n) {

        switch (n % 4) {

            case 0:
                return n;

            case 1:
                return 1;

            case 2:
                return n + 1;

            default:
                return 0;
        }
    }

    public static void main(String[] args) {

        int n = 10;

        System.out.println("XOR from 1 to " + n + ": " + xorFromOne(n));
    }
}

// XOR from 1 to 10: 11
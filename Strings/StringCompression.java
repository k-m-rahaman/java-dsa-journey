public class StringCompression {

    public static void main(String[] args) {

        String str = "aaabbcccc";

        String compressed = "";

        int count = 1;

        for(int i = 1; i <= str.length(); i++) {

            if(i < str.length()
                    && str.charAt(i)
                    == str.charAt(i - 1)) {

                count++;
            }
            else {

                compressed += str.charAt(i - 1);
                compressed += count;

                count = 1;
            }
        }

        System.out.println(compressed);
    }
}
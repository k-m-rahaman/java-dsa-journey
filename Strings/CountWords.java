public class CountWords {

    public static void main(String[] args) {

        String sentence =
                "Java DSA Journey Repository";

        String[] words =
                sentence.split("\\s+");

        System.out.println(
                "Words = " + words.length);
    }
}
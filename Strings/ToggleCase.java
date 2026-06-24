public class ToggleCase {

    public static void main(String[] args) {

        String str = "JavaDSA";

        String result = "";

        for(char ch : str.toCharArray()) {

            if(Character.isUpperCase(ch))
                result += Character.toLowerCase(ch);

            else
                result += Character.toUpperCase(ch);
        }

        System.out.println(result);
    }
}
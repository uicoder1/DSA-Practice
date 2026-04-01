public class LengthOfLastWord {

    public static int lengthOfLastWord(String s) {

        int i = s.length() - 1;
        int length = 0;

        // Step 1: skip trailing spaces
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        // Step 2: count last word
        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }

        return length;
    }

    public static void main(String[] args) {

        String s1 = "Hello World";
        String s2 = "   fly me   to   the moon  ";
        String s3 = "luffy is still joyboy";

        System.out.println("Output 1: " + lengthOfLastWord(s1));
        System.out.println("Output 2: " + lengthOfLastWord(s2));
        System.out.println("Output 3: " + lengthOfLastWord(s3));
    }
}
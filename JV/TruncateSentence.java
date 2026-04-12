public class TruncateSentence {

    public static String truncateSentence(String s, int k) {

        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == ' ') {
                count++;

                if (count == k) {
                    return s.substring(0, i);
                }
            }
        }

        return s;
    }

    public static void main(String[] args) {

        String s1 = "Hello how are you Contestant";
        int k1 = 4;

        String s2 = "What is the solution to this problem";
        int k2 = 4;

        String s3 = "chopper is not a tanuki";
        int k3 = 5;

        System.out.println(truncateSentence(s1, k1));
        System.out.println(truncateSentence(s2, k2));
        System.out.println(truncateSentence(s3, k3));
    }
}
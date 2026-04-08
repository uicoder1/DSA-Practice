import java.util.*;

public class SubstringConcatenation {

    public static List<Integer> findSubstring(String s, String[] words) {

        List<Integer> result = new ArrayList<>();

        if (s == null || s.length() == 0 || words.length == 0)
            return result;

        int wordLen = words[0].length();
        int wordCount = words.length;

        HashMap<String, Integer> map = new HashMap<>();

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        for (int i = 0; i < wordLen; i++) {

            int left = i;
            int count = 0;

            HashMap<String, Integer> window = new HashMap<>();

            for (int j = i; j + wordLen <= s.length(); j += wordLen) {

                String word = s.substring(j, j + wordLen);

                if (map.containsKey(word)) {

                    window.put(word, window.getOrDefault(word, 0) + 1);
                    count++;

                    while (window.get(word) > map.get(word)) {

                        String leftWord = s.substring(left, left + wordLen);
                        window.put(leftWord, window.get(leftWord) - 1);
                        left += wordLen;
                        count--;
                    }

                    if (count == wordCount) {
                        result.add(left);
                    }

                } else {
                    window.clear();
                    count = 0;
                    left = j + wordLen;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {

        String s = "barfoothefoobarman";
        String[] words = {"foo", "bar"};

        System.out.println(findSubstring(s, words));
    }
}
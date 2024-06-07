import java.util.ArrayList;
import java.util.List;

class CommonCharacter {
    public static void main(String[] args) {
        String word[] = {"bella", "label", "roller"};
        List<String> ans = commonChars(word);
        System.out.println(ans);
    }
    public static List<String> commonChars(String[] words) {
        int minFrequency[] = new int[26];
        for (int i = 0; i < 26; i++) {
            minFrequency[i] = Integer.MAX_VALUE;
        }
        for (String word : words) {
            int[] charCount = new int[26];
            for (char c : word.toCharArray()) {
                charCount[c - 'a']++;
            }
            for (int i = 0; i < 26; i++) {
                minFrequency[i] = Math.min(minFrequency[i], charCount[i]);
            }
        }
        List<String> ans = new ArrayList<>();
        for (int a = 0; a < 26; a++) {
            while (minFrequency[a] > 0) {
                ans.add(Character.toString((char) a + 'a'));
                minFrequency[a]--;
            }
        }
        return ans;
    }
}

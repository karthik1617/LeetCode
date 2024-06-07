class LongestPalindrome {
    public static void main(String[] args) {
        String s="aaabccccdd";
        int ans=longestPalindrome(s);
        System.out.println(ans);
    }
    public static int longestPalindrome(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }
        int[] dict = new int[26];
        for (char ch : s.toCharArray()) {
            dict[ch-'a']++;
        }
        int maxLength = 0;
        boolean oddUsed = false;
        for (int count : dict) {
            if(count>0) {
                if (count % 2 != 0 && !oddUsed) {
                    oddUsed = true;
                    maxLength += count;
                } else {
                    maxLength += count / 2 * 2; // universal for both, even and odd numbers
                }
            }
        }
        return maxLength;
    }
}
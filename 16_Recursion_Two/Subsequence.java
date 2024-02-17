public class Subsequence {
    //O(2^n) - Time Complexity
    public static void subsequences(String str, int idx, String newString) {
        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }
        char currentChar = str.charAt(idx);

        // to be
        subsequences(str, idx + 1, newString + currentChar);

        // or not to be
        subsequences(str, idx + 1, newString);
    }

    public static void main(String[] args) {
        String str = "abc";
        subsequences(str, 0, "");
    }
}

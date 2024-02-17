public class KeypadCombination {
    public static String[] keypad = { ".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yx" };

    public static void printCombinations(String str, int idx, String combination) {
        if (idx == str.length()) {
            System.out.println(combination);
            return;
        }
        char currentChar = str.charAt(idx);
        String mapping = keypad[currentChar - '0'];

        for (int i = 0; i < mapping.length(); i++) {
            printCombinations(str, idx + 1, combination + mapping.charAt(i));
        }
    }

    public static void main(String[] args) {
        String str = "67";
        printCombinations(str, 0, "");
    }
}

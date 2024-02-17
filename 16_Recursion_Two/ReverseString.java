
public class ReverseString {
    public static void reverseaString(String str, int idx) {
        if (idx == 0) {
            System.out.println(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx) + " ");
        reverseaString(str, idx - 1);
    }

    public static void main(String[] args) {
        String str = "abcd";
        reverseaString(str, str.length()-1);
    }
}

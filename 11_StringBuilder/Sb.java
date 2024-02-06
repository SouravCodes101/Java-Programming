import java.util.*;

public class Sb {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        // System.out.println(sb);

        // Char at index 0
        // System.out.println(sb.charAt(0));

        // Set char at index
        sb.setCharAt(0, 'P');
        // System.out.println(sb);

        // Insert char at index
        sb.insert(2, 'n');
        // System.out.println(sb);

        // delete the extra 'n'
        sb.delete(2, 4);
        // System.out.println(sb);

        StringBuilder hello = new StringBuilder("h");
        hello.append("e"); //Changes made in the same StringBuilder and not on a new memory location
        hello.append("l");
        hello.append("l");
        hello.append("o");
        System.out.println(hello);

    }
}

import java.util.*;

public class Strings {
    public static void main(String args[]) {
        // !Concatenation
        String firstName = "Tony";
        String lastName = "Stark";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName.length());

        // !charAt
        for (int i = 0; i < fullName.length(); i++) {
            System.out.print(fullName.charAt(i));
        }
        System.out.println();
        // !Comparision
        String name1 = "Tony";
        String name2 = "Tony";
        // if(name1.compareTo(name2)==0){
        // System.out.println("Strings are equal.");
        // } else {
        // System.out.println("Strings are not equal.");
        // }

        // if(name1 == name2) {
        // System.out.println("Strings are equal");
        // } else {
        // System.out.println("Strings are NOT equal");
        // }

        // if(new String("Tony") == new String("Tony")) {
        // System.out.println("Strings are equal");
        // } else {
        // System.out.println("Strings are NOT equal");
        // }

        // !Substring
        String sentence = "TonyStark";
        String name = sentence.substring(4,sentence.length());
        System.out.println(name);

        //?~Strings Are Immutable!!
    }
}
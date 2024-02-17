

public class FirstAndLastOccurence {
    public static int first = -1;
    public static int last = -1;

    public static void printOccurence(String str, int idx, char element){
        if(idx == str.length()) {
            System.out.println("First Occurence at index " + first);
            System.out.println("Last Occurence at index " + last);
            return;
        }
        int currentChar = str.charAt(idx);

        if(currentChar == element) {
            if(first == -1) {
                first = idx;
            } else {
                last = idx;
            }
        }
        printOccurence(str, idx + 1, element);
    }
    
    public static void main(String[] args) {
        String str = "abaacdaefaah";
        printOccurence(str, 0, 'a');
    }
}

import java.util.*;

public class Username {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your email address: ");
        String email = sc.nextLine();
        String username = "";
        for(int i = 0; i<email.length(); i++) {
            if(email.charAt(i) == '@') {
                break;
            } else {
                username += email.charAt(i);
            }
        }

        System.out.println("Your Username is : " + username);
    }
}
 
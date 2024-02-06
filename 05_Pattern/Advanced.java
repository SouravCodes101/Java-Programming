public class Advanced {
    public static void main(String[] args) {
        // int n = 4;
        // // Upper Half
        // for (int i = 1; i <= n; i++) {
        // // 1St Half
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // // Spaces
        // int spaces = 2 * (n - i);
        // for (int j = 1; j <= spaces; j++) {
        // System.out.print(" ");
        // }
        // // 2Nd Half
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // // Lower Half
        // for (int i = n; i >= 1; i--) {
        // // 1St Half
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // // Spaces
        // int spaces = 2 * (n - i);
        // for (int j = 1; j <= spaces; j++) {
        // System.out.print(" ");
        // }
        // // 2nd Half
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // Solid Rhombus
        // int n = 5;
        // for (int i = 1; i <= n; i++) {
        // for(int j = 1; j<=n-i; j++){
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= n; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // Hollow Rhombus
        // int n = 5;
        // int m = 5;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n - i; j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= m; j++) {
        // if (i == 1 || j == 1 || i == n || j == m) {
        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // Number Pyramid
        // int n = 5;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n - i; j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= i; j++) {
        // System.out.print(i + " ");
        // }
        // System.out.println();
        // }

        // Palindromic Pattern
        // int n = 5;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n - i; j++) {
        // System.out.print(" ");
        // }
        // for (int j = i; j >= 1; j--) {
        // System.out.print(j);
        // }
        // for (int j = 1; j <= i; j++) {
        // System.out.print(j);
        // }
        // System.out.println();
        // }

        // // Diamond Pattern
        // int n = 5;
        // //Upper Half
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= n - i; j++) {
        //         System.out.print(" ");
        //     }
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     for (int j = 2; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println(" ");
        // }
        // //Lower Half
        // for (int i = n; i >= 1; i--) {
        //     for (int j = 1; j <= n - i; j++) {
        //         System.out.print(" ");
        //     }
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     for (int j = 2; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println(" ");
        // }
    }
}

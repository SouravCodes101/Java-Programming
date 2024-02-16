public class XtoPowN {
    public static int calcPow(int n, int x) {
        if( n == 0 ) { //base case 1
            return 1;
        }
        if(x == 0) { //base case 2
            return 0;
        }
        int xPownm1 = calcPow(n-1, x);
        int xPown = x * xPownm1;
        return xPown;
    }
    public static void main(String[] args) {
        int x = 2, n = 5;
        int ans = calcPow(n, x);
        System.out.println(ans);
    }
}

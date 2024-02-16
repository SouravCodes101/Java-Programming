public class XtoPowNLogN {
    public static int calcPow(int n, int x) {
        if(n ==0) {
            return 1;
        }
        if(x==0) {
            return 0;
        }
        if (n % 2 == 0) {
            return calcPow(n / 2, x) * calcPow(n / 2, x); //When x is even
        } else {
            return calcPow(n / 2, x) * calcPow(n / 2, x) * x; //When x is odd
        }
    }

    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        int ans = calcPow(n, x);
        System.out.println(ans);
    }
}

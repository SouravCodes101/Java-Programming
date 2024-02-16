public class Print {
    public static void printNum(int n) {
        if(n==0) {
            return ;
        }

        System.out.println(n);
        printNum(n-1);
    }

    public static void printNum1(int n) {
        if(n == 6) {
            return ;
        }
        System.out.println(n);
        printNum1(n + 1);
    }

    public static void printSum( int i,int sum, int n) {
        if(i == n) {
            sum += i;
            System.out.println(sum);
            return;
        }
        sum = sum + i;
        printSum(i+1, sum, n);
    }
    public static void main(String[] args) {
        printSum(1, 0, 5);
    }
}

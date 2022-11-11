public class Main {
    public static void main(String[] args) {
        factorial(8);
    }

    static void factorial(int num) {
        int result = 1;
        for (int i = 1; i <= num; ++i) {
            result *= i;
        }
        System.out.print(result);
    }
}
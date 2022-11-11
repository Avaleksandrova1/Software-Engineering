public class Main {
    public static void main(String[] args) {

        fibonacci(11);
    }

    static void fibonacci(int num) {
        int[] array = new int[num];
        array[0] = 0;
        array[1] = 1;
        for (int i = 2; i < num; ++i) {
            array[i] = array[i - 1] + array[i - 2];
        }
        for (int i = 0; i < num; ++i) {
            System.out.print(array[i] + " ");
        }
    }
}
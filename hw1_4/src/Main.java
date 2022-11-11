public class Main {
    public static void main(String[] args) {
        System.out.print("Current array: ");
        int[] array = {-1,6, 8,2, 0,-10,7};
        for (int i = 0; i < array.length; ++i) {
            System.out.print(array[i]+" ");
        }
        bubbleSort(array);
        System.out.print("\n" + "Sorted array: ");
        for (int i = 0; i < array.length; ++i) {
            System.out.print(array[i]+" ");
        }
    }

    static public void bubbleSort(int[] array) {
        for(int i = array.length-1 ; i > 0 ; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
    }
}
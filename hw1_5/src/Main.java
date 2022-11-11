import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String str;
        {
            Scanner in = new Scanner(System.in);
            System.out.print("Input the string: ");
            str = in.nextLine();
            count(str);
        }
    }

    public static void count(String str) {
        int count_v = 0;
        int count = 0;
        for (int i = 0; i < str.length(); ++i) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
                    || str.charAt(i) == 'o' || str.charAt(i) == 'u' || str.charAt(i) == 'A'
                    || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U') {
                ++count_v;
            }
            ++count;
        }
        System.out.print("Number of  Vowels: " + count_v + "\n");
        System.out.print("Number of  Consonants: " + (count-count_v) + "\n");
    }
}

import java.util.Scanner;

public class decimalbinary {
    static int binary_1(int k) {
        if (k % 2 == 0) {
            return 0;
        } else return 1;
    }

    static int lengthbinary(int w) {
        int z = 1;
        while (w != 1) {
            w = w / 2;
            z++;
        }
        return z;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String s = Integer.toString(a);
        int k[];
        k = new int[lengthbinary(a)];
        int j = lengthbinary(a);
        for (int i = 0; i < j; i++) {
            k[i] = binary_1(a);
            a = a / 2;
        }
        for (int i = j - 1; i >= 0; i--) {
            System.out.print(k[i]);
        }
    }
}

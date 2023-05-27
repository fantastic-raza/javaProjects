import java.util.Scanner;
import java.util.Random;

class guessNum {
    public static void main(String[] args) {
        Random r = new Random();
        int k = r.nextInt(100);
        hint(k);
    }

    static void hint(int k) {
        int a;
        Scanner sc = new Scanner(System.in);
        int i = 0;
        System.out.println("guess the no.");
        do {
            i++;
            a = sc.nextInt();
            if (a < k) {
                System.out.println("guess a bigger no.");
            } else if (a > k) {
                System.out.println("guess a smaller no.");
            } else if (a == k) {
                System.out.println("hurrah! you are right you guessed in " + i + "attempts");
            }

        } while (a != k);
    }
}




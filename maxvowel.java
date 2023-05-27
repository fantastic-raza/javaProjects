import java.util.Scanner;

public class maxvowel {

    public static void main(String[] args) {
        maxvowel an = new maxvowel();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();
        an.maxVowels(s, k);

    }

    static int vowel(char c) {
        if (c == 'a') return 1;
        else if (c == 'e') return 1;
        else if (c == 'i') return 1;
        else if (c == 'o') return 1;
        else if (c == 'u') return 1;
        else return 0;
    }

    void maxVowels(String s, int k) {
        int n = 0;
        int i;
        for (i = 0; i < s.length(); i++) {
            n += vowel(s.charAt(i));
        }
        if (n < k) {
            System.out.println(n);
        } else if (n >= k) {
            System.out.println(k);
        }
    }
}
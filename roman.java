
import java.util.Scanner;

class roman {


    public static void main(String[] args) {
        int i;
        int res = 0;
        System.out.println("enter the roman no.(no. must be in capslock)");
        Scanner stringScanner = new Scanner(System.in);
        String s = stringScanner.next();
        int n = s.length();
        for (i = 0; i < n - 1; i++) {
            int a = getvalue(s.charAt(i));
            int b = getvalue(s.charAt(i + 1));

            if (a >= b) {
                res += a;
            }
            if (a < b) {
                res -= a;
            }
        }
        res += getvalue(s.charAt(n - 1));
        System.out.println(res);
    }

    static int getvalue(char c) {
        if (c == 'I') return 1;
        else if (c == 'V') return 5;
        else if (c == 'X') return 10;
        else if (c == 'L') return 50;
        else if (c == 'C') return 100;
        else if (c == 'D') return 500;
        else return 1000;

    }
}


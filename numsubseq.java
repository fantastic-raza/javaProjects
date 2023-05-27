
import java.util.Arrays;

class numsubseq {

    public static void main(String[] args) {
        int[] s = {1, 2, 3, 4};
        int k = 9;
        seq(s, k);
    }

    static void seq(int[] s, int k) {
        Arrays.sort(s);
        for (int j = 0; j <= s.length; j++) {
            for (int i = j; i < s.length; i++) {
                int p;
                int r = i;
                int[] g = new int[++r];
                for (p = j; p <= i; p++) {
                    g[p] = s[p];
                }
                if (g[0] + g[i] <= k) {
                    for (int q = j; q <= i; q++) {
                        System.out.print(g[q]);
                    }
                    System.out.print(',');
                }
            }
        }
    }

}
public class varrargs {
    static int varargs(int... arr) {
        int result = 0;
        for (int a : arr) {
            result += a;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(varargs(4, 4, 7, 3, 8));
    }
}

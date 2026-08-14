public class RefVsVal {
    static void modify(int x, int[] arr) {
        x = 100;
        arr[0] = 100;
    }

    public static void main(String[] args) {
        int a = 5;
        int[] b = {5};

        modify(a, b);

        System.out.println(a);
        System.out.println(b[0]);
    }
}
public class FinalDemo {
    static void tryModify(final int[] arr) {
        arr[0] = 999;
    }

    public static void main(String[] args) {
        final int[] a = {1, 2, 3};
        a[0] = 500;
        tryModify(a);

        for (int v : a) System.out.println(v);

        final StringBuilder sb = new StringBuilder("hi");
        sb.append(" there");
        System.out.println(sb);

//        a = new int[]{9, 9, 9};
    }
}
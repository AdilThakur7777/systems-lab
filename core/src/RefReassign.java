public class RefReassign {
    static void reassign(int[] arr) {
        arr = new int[]{999};
        System.out.println(arr[0]);
    }

    static void mutate(int[] arr) {
        arr[0] = 999;
    }

    public static void main(String[] args) {
        int[] a = {1};
        reassign(a);
        System.out.println(a[0]);

        int[] b = {1};
        mutate(b);
        System.out.println(b[0]);
    }
}
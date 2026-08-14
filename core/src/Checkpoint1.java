import java.util.Arrays;

public class Checkpoint1 {
    static class Node {
        int val;
        Node(int val) { this.val = val; }
    }

    static void tweak(Integer x, Node n, int[] arr) {
        x = x + 1;
        n.val = 50;
        arr = new int[]{7, 7, 7};
    }

    public static void main(String[] args) {
        Integer count = 10;
        Node node = new Node(1);
        int[] data = {1, 2, 3};

        tweak(count, node, data);

        System.out.println(count);   //11
        System.out.println(node.val); //50
        System.out.println(data[0]); //1

        Node[] a1 = { new Node(5), new Node(6) };
        Node[] a2 = Arrays.copyOf(a1, a1.length);
        a2[0].val = 100;
        a2[1] = new Node(200);

        System.out.println(a1[0].val);
        System.out.println(a1[1].val);
    }
}
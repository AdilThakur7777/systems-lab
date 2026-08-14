public class InternDemo2 {
    public static void main(String[] args) {
        String p = new String("systems") + "";
        String q = p.intern();

        System.out.println("p == q : " + (p == q));

        String r = "systems";

        System.out.println("q == r : " + (q == r));
        System.out.println("p == r : " + (p == r));
    }
}
public class IntegerCacheDemo2 {
    public static void main(String[] args) {
        Integer a = 100;
        Integer b = 50 + 50;

        Integer c = 200;
        Integer d = 100 + 100;

        int e = 200;
        Integer f = 200;

        System.out.println(a == b);
        System.out.println(c == d);
        System.out.println(e == f);
    }
}
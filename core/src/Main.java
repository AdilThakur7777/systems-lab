public class Main {

            public static void main(String[] args) {
                        String x = new String("world");   // definitely a fresh heap object, NOT pooled
                        String y = "world";                // definitely the pooled object

                        System.out.println("x == y before intern: " + (x == y));

                        String z = x.intern();             // ask: "give me the pooled version of x's content"

                        System.out.println("z == y after intern: " + (z == y));
                        System.out.println("x == y still:        " + (x == y)); // x itself is untouched
                    }

}

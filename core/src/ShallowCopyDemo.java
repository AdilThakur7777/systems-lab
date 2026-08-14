import java.util.Arrays;

public class ShallowCopyDemo {
    static class Box {
        int value;
        Box(int value) { this.value = value; }
    }

    public static void main(String[] args) {
        Box[] original = { new Box(1), new Box(2), new Box(3) };
        Box[] copy = Arrays.copyOf(original, original.length);

        copy[0].value = 999;
        copy[1] = new Box(555);

        System.out.println(original[0].value);
        System.out.println(original[1].value);
        System.out.println(copy[0].value);
        System.out.println(copy[1].value);
    }
}
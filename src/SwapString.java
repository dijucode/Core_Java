public class SwapString {
    public static void main(String[] args) {
        String a = "Java";
        String b = "Programming";
        a = a + b;
        System.out.println(a);
        b = a.substring(0, 4);
        a = a.substring(4);
        System.out.println(a);
        System.out.println(b);

    }
}

import java.util.*;
public class Demo {
    public static void main(String[] args) {
        int a = 5;
        int b = a++ + ++a + ++ a;
//              5       7       8 = 20

        System.out.println(b);

    }
}

import java.sql.SQLOutput;

public class CloneDemo implements Cloneable {
    public static void main(String[] args) throws Exception {
        CloneDemo cd = new CloneDemo();
        Object clone = cd.clone();
        System.out.println(cd);
        System.out.println(clone);

    }
}
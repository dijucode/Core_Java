import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DemoBufferReader {
    public static void main(String[] args) throws Exception {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader((isr));
        String str = br.readLine();
        System.out.println(str);
    }
}

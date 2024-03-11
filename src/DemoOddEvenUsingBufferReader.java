import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DemoOddEvenUsingBufferReader {
    public static void main(String[] args) throws Exception {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String str = br.readLine();
        Integer i = Integer.parseInt(str);
        if (i % 2 == 0){
            System.out.println("even");

        }
        else{
            System.out.println("odd");
        }

    }
}

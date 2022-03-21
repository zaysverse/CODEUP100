import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String f = sc.next();
        StringTokenizer st = new StringTokenizer(f,".");
        String[] numbers=new String[2];
        int i =0;
        while(st.hasMoreTokens())
        {
            numbers[i]= st.nextToken();
            i++;
        }
        System.out.println(numbers[0]+"\n"+numbers[1]);
    }
}

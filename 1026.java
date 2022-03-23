import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String time = sc.next();
        String[] st = time.split(":");
        System.out.println(Integer.parseInt(st[1]));
    }
}

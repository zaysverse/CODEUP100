import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String date_ = sc.nextLine();
        String[] date = date_.split("\\.");
        System.out.println(date[2]+"-"+date[1]+"-"+date[0]);
    }
}

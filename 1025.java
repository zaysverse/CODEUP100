import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int five = sc.nextInt();
        System.out.println("["+(five/10000)*10000+"]");
        System.out.println("["+(five/1000%10)*1000+"]");
        System.out.println("["+(five/100%10)*100+"]");
        System.out.println("["+(five/10%10)*10+"]");
        System.out.println("["+(five%10)+"]");
    }
}

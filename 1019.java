import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String date = sc.next();
        String[] temp = date.split("\\.");
        int y=Integer.parseInt(temp[0]);
        int m=Integer.parseInt(temp[1]);
        int d=Integer.parseInt(temp[2]);
        System.out.printf("%04d.%02d.%02d",y,m,d);
    }
}

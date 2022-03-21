import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        String[] id_=id.split("-");
        System.out.println(id_[0]+id_[1]);
    }
}

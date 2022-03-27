import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch;

//        while(true){
//            ch = sc.next().charAt(0);
//            System.out.println(ch);
//            if(ch=='q') break;
//        }

        do {
            ch = sc.next().charAt(0);
            System.out.println(ch);
        }while (ch != 'q');
    }
}

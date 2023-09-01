import java.sql.SQLOutput;
import java.util.Scanner;

public class b2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ax2 + bx +c = 0");
        System.out.println("a : " );
        int a = scanner.nextInt();
        System.out.println("b : " );
        int b = scanner.nextInt();
        System.out.println("c : " );
        int c = scanner.nextInt();
        double delta = (double)(b*b) - (4*a*c);
//        System.out.println(delta);
        double x1 = (-b + Math.sqrt(delta))/(2 * a);
        double x2 = (-b - Math.sqrt(delta))/(2 * a);
        String y = (0  >  delta) ? "Phương trình vô nghiệm" : "Phương trình có nghiệm x1, x2 lần lượt là: " + x1 + " và " + x2;
        System.out.println(y);


//        if (delta < 0){
//            System.out.println("Phương trình vô nghiệm");
//        } else {
//            System.out.println("Phương trình có nghiệm x1, x2 lần lượt là: " + x1 + " và " + x2);
//        }

    }
}

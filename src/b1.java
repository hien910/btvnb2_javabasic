import java.util.Scanner;

public class b1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ax + b = 0");
        System.out.println("a : " );
        int a = scanner.nextInt();
        System.out.println("b : " );
        int b = scanner.nextInt();



        System.out.println("Nghiệm của phương  trình là: x = "+ (double) -b/a);

    }
}

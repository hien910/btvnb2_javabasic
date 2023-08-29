import java.util.Scanner;

public class b3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chiều dài của hình chữ nhật là: ");
        int a = scanner.nextInt();
        System.out.println("Chiều rộng của hình chữ nhật là: ");
        int b = scanner.nextInt();
        System.out.println("Chu vi của hình chữ nhật là: "+ (2 * (a + b)));
        System.out.println("Diện tích của hình chữ nhật là: "+ (a*b));
    }

}
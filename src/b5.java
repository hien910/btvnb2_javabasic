import java.util.Scanner;

public class b5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào 1 chuỗi: ");
        String a1 = scanner.nextLine();
        System.out.println("Nhập vào 1 tý tự: ");
        char a2 = scanner.next().charAt(0);

        System.out.println("Vị trí ký tự xuất hiện đầu tiên trong chuỗi: " + a1.indexOf(a2));
        System.out.println("Vị trí ký tự xuất hiện cuối cùng trong chuỗi: " + a1.lastIndexOf(a2));

        System.out.println("----------------------------------------");
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Nhập vào xâu ký tự s: ");
        String s = scanner1.nextLine();

        System.out.println("Nhập vào xâu ký tự s2: ");
        String s1 = scanner1.nextLine();

        System.out.println("Nhập vào xâu ký tự s3: ");
        String s2 = scanner1.nextLine();

        System.out.println(s.replace(s1,s2));



    }
}

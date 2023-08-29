import java.util.Scanner;

public class b7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập bán kính của hình tròn: ");
        int r = scanner.nextInt();
//        System.out.println("r= "+r);


        System.out.println("Chu vi hình tròn là: " + (double)Math.round((Math.PI * 2 *r)*1000)/1000);
        System.out.println("Diện tích hình tròn là: " + (double)Math.round((Math.PI * r *r)*1000)/1000);

    }
}

import java.util.Scanner;

public class b6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int AC = 5;
        int AB = 12;
        int BC = 13;
        System.out.println("Tam giác vuông ABC vuông tại A có độ dài 3 cạnh AC, AB, BC lần lượt là: " + AC + "," + AB + "," + BC);

        double sin = (double)AB/BC;
        double cos = (double)AC/BC;

        System.out.println("Sin của góc ACB= "+ (double)Math.round(sin * 100)/ 100) ;
        System.out.println("Cos của góc ACB= "+ (double)Math.round(cos * 100)/ 100) ;

    }
}

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class b4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập ngày tháng năm sinh của bạn là(dd-MM-yyy): ");
        String a = scanner.nextLine();

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate localDate1 = LocalDate.parse(a, dateTimeFormatter);
        LocalDate now = LocalDate.now();

//        System.out.println(localDate1);
//        System.out.println("now: "+ now);

        long yearBetween = ChronoUnit.YEARS.between(localDate1, now);
        System.out.println("Tuổi của bạn là: " + yearBetween);



    }
}

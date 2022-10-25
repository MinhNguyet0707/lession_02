import java.time.LocalDate;
import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        int age,year;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào năm sinh: ");
        year = sc.nextInt();
        LocalDate localdate = LocalDate.now();
        age = localdate.getYear() - year;
        System.out.println("tuổi của bạn là:"+age);
    }
}

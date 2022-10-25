
import java.util.Scanner;
import java.util.regex.Pattern;

public class Bai5_02 {
    public static void main(String[] args) {
         String s;
         String s1;
         String s2;
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        String chuoiMoi = s.replaceAll(s1,s2);
        System.out.println(chuoiMoi);
    }
}

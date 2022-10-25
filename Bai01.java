import java.util.Scanner;

public class Bai01 {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số a");
        a=sc.nextInt();
        System.out.println("nhập số b");
        b=sc.nextInt();
        int x=-b/a;
        System.out.println("kết quả là x: "+x);

    }
}

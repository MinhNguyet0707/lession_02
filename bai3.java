import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        double a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào chiều dài hcn");
        a=sc.nextInt();
        System.out.println("nhập vào chiều rộng hcn");
        b=sc.nextInt();
        double p =2*(a+b);
        double s=a*b;
        System.out.println("chi vi hình chữ nhật la :"+p);
        System.out.println("diẹn tích hình chữ nhật la :"+s);

    }
}

import java.sql.SQLOutput;
import java.util.Scanner;
public class Bai2 {
    public static void main(String[] args) {
        double a,b,c,x1,x2,delta;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao a");
        a=sc.nextDouble();
        System.out.println("nhap vao b");
        b=sc.nextDouble();
        System.out.println("nhap vao c");
        c=sc.nextDouble();
        delta=Math.pow(b, 2)-(4*a*c);
        x1=(-b-Math.sqrt(delta))/(2*a);
        System.out.println(x1);
        x2=(-b+Math.sqrt(delta))/(2*a);
        System.out.println(x2);
        String ketqua =(delta>0)? " x1 && x2" :(delta==0)? "x1=x2=-b/(2*a)":"vo nghiêm";
    }
}

import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        int r;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào bán kính đường tròn: ");
        r=sc.nextInt();
       double c = (r*2)*Math.PI;
        System.out.println("chi vi hình tròn là : "+c);
        double s = Math.PI*(r*r);
        System.out.println("diện tích hìn tròn là :"+s);


    }
}

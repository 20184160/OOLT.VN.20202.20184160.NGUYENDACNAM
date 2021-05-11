import java.util.Scanner;

public class TestFDE {
    public static void main(String[] args){
        double a,b;
        System.out.println("Nhap cac gia tri cua phuong trinh: ");
        System.out.print("a =  ");
        a = new Scanner(System.in).nextDouble();
        System.out.print("b = ");
        b = new Scanner(System.in).nextDouble();
        FDE eq= new FDE(a,b);
       System.out.println(eq.resolve(a,b));
    }
}
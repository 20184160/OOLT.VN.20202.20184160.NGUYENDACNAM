import java.util.Scanner;

public class TestSDE {
    public static void main(String[] args){
        double a,b,c;
        System.out.println("Nhap cac gia tri cua phuong trinh: ");
        System.out.print("a = ");
        a = new Scanner(System.in).nextDouble();
        System.out.print("b = ");
        b = new  Scanner(System.in).nextDouble();
        System.out.print("c = ");
        c = new  Scanner(System.in).nextDouble();
        SDE eq= new SDE(a,b,c);
        System.out.println(eq.resolve());
    }
}
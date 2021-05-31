import java.util.Scanner;

public class test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi: "); String s1 = sc.nextLine();
        String s2[] = s1.split(" "); 
        for(String s4 : s2){
            String s5[] = s4.split("");
            System.out.print(s5[0]);
        }
    }
}

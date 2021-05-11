import static java.lang.Math.sqrt;

public class SDE {
    private double a;
    private double b;
    private double c;
    private double dt;

    public SDE(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public String resolve(){
        dt = b*b - 4 * a * c;
        if(dt == 0) return "Phuong trinh co nghiem kep : " + -b/2*a + ".";
        else if (dt < 0) return "Phuong trinh vo nghiemm.";
        else return " Phuong trinh co 2 nghiem : " + (-b + sqrt(dt))/(2 * a) + " and "
            + (-b - sqrt(dt))/(2 * a) +".";
    }
}
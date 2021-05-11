public class SOFDE {
    private double a11;
    private double a12;
    private double b1;
    private double a21;
    private double a22;
    private double b2;
    private double d;
    private double d1;
    private double d2;


    public SOFDE(double a11, double a12, double b1, double a21, double a22, double b2){
        this.a11 = a11;
        this.a12 = a12;
        this.b1 = b1;
        this.a21 = a21;
        this.a22 = a22;
        this.b2 = b2;
    }

    public double getA11(){
        return a11;
    }

    public void setA11(double a11){
        this.a11 = a11;
    }

    public double getA12(){
        return a12;
    }

    public void setA12(double a12){
        this.a12 = a12;
    }

    public double getB1(){
        return b1;
    }

    public void setB(double b1){
        this.b1 = b1;
    }

    public double getA21(){
        return a21;
    }

    public void setA21(double a21){
        this.a21 = a21;
    }

    public double getA22(){
        return a22;
    }

    public void setA22(double a22){
        this.a22 = a22;
    }

    public double getB2(){
        return b2;
    }

    public void setB2(double b2){
        this.b2 = b2;
    }
    public String resolve(){
        d = getA11() * getA22() - getA21() * getA12();
        d1 = getB1() * getA22() - getB2() * getA12();
        d2 = getA11() * getB2() - getA21() * getB1();
        if (d == 0)
            if (d1 == 0 && d2 == 0)
                return "He phuong trinh co vo so nghiem.";
            else return "He phuong trinh vo nghiem.";
        else
            return "He phuong trinh co cap nghiem duy nhat (x1/x2) = ( " + d1/d + " ," + d2/d + " ).";
    }
}
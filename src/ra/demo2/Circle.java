package ra.demo2;

public class Circle extends Shape{
    private double r;
    public static final double PI = 3.14;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double getArea() {
        return r*PI*PI;
    }
}

package ra.demo2;

public abstract class Shape {
    private String color;

    public Shape() {
    }
    public abstract double getArea();
    public void display(){
        System.out.println("Mau "+color);
    }
}

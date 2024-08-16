package ra.demo2;

public class Test {
    public static void main(String[] args) {
        Shape circle = new Circle(40);
        System.out.println("Dien tich hinh tron = "+circle.getArea());
        Shape rectangle = new Rectangle(10,20);
        System.out.println("Din tich hinh chu nhat = "+rectangle.getArea());
    }
}

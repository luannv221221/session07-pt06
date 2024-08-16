package ra.demo5;

public class Test {
    public static void main(String[] args) {
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee("Main",1200,4);

        System.out.println("Luong cua mai "+partTimeEmployee.calculateSalary());

        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("Lam",500);
        System.out.println("Luog cua Lam "+fullTimeEmployee.calculateSalary());
    }
}

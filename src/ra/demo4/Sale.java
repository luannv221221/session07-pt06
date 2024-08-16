package ra.demo4;

import java.util.Scanner;

public class Sale implements IEmployee {
    private String code;
    private double bonusSalary;

    public Sale() {
    }

    public Sale(String code, double bonusSalary) {
        this.code = code;
        this.bonusSalary = bonusSalary;
    }

    public void callVideo(){
        System.out.println("Sale đang gọi khách hàng");
    }

    @Override
    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao ma nhan vien ");
        this.code = scanner.nextLine();
        System.out.println("Nhaập vào lương thưởng ");
        this.bonusSalary = Double.parseDouble(scanner.nextLine());
    }

    @Override
    public void displayData() {
        System.out.println("Mã nhân viên "+this.code);
        this.calSalary();
    }

    @Override
    public void calSalary() {
        System.out.println("Lương "+(this.bonusSalary+SALARY));
    }
}

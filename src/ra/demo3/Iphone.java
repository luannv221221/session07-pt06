package ra.demo3;

public class Iphone implements Phone,Camara{
    @Override
    public void call() {
        System.out.println("Iphone Đang gọi điện");
    }

    public void playGame(){
        System.out.println("IPHONE ĐANG CHOI CHEM HOA QUA");
    }

    @Override
    public void chup() {
        System.out.println("IPHONE ĐANG CHỤP ẢNH");
    }
}

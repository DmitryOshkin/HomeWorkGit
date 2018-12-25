package Gitwork;

public class WorkHomeGit {
    public static void main(String[] args) {
        System.out.println("Hello, World!!!");
        // Write
        Car littlecar = new Car("bmw", 1500, 500);
        System.out.println(littlecar);
        littlecar.setPower(100);
        System.out.println(littlecar);
        Lorry BigCar = new Lorry("Lada", 1234, 150, 1500);
        System.out.println(BigCar);
        BigCar.setBrand("Citroen");
        BigCar.setCarrying(2500);
        System.out.println(BigCar);
    }
}

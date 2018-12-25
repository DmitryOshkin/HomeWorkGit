package Gitwork;

public class WorkHomeGit {
    public static void main(String[] args) {
        System.out.println("Hello, World!!!");
        // Write
        Car littleСar = new Car("bmw", 1500, 500);
        System.out.println(littleСar);
        littleСar.setPower(100);
        System.out.println(littleСar);
        littleСar.addPower(50);
        System.out.println(littleСar);
        Lorry bigCar = new Lorry("Lada", 1234, 150, 1500);
        System.out.println(bigCar);
        bigCar.setBrand("Citroen");
        bigCar.setCarrying(2500);
        System.out.println(bigCar);
        bigCar.addCarrying(380);
        System.out.println(bigCar);
    }
}

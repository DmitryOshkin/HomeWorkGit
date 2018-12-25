package Gitwork;

public class Lorry extends Car {

    private int carrying; //грузоподъемность

    /**
     * конструктор класса Lorry
     *
     * @param brand
     * @param weight
     * @param power
     * @param carrying
     */
    public Lorry(String brand, int weight, int power, int carrying) {
        super(brand, weight, power);
        this.carrying = carrying;
    }

    public void setBrand(String brand) {
        this.brand = brand;

    }

    public void setCarrying(int carrying) {
        this.carrying = carrying;
    }

    // изменение значения грузоподъемности
    public void addCarrying(int carrying) {
        this.carrying += carrying;
    }

    @Override
    public String toString() {
        return "Lorry{" +
                "weight=" + getWeight() +
                ", power=" + getPower() +
                ", carrying=" + carrying +
                ", brand='" + brand + '\'' +
                '}';
    }
}

package Gitwork;

public class Car {
    String brand; //торговая марка
    private int weight; //вес
    private int power; //мощность

    /**
     * Конструктор -
     *
     * @param brand
     * @param weight
     * @param power
     */
    public Car(String brand, int weight, int power) {
        this.brand = brand;
        this.weight = weight;
        this.power = power;
    }

    // геттеры возврат значения поля
    public String getBrand() {
        return brand;
    }

    public int getWeight() {
        return weight;
    }

    public int getPower() {
        return power;
    }

    // изменение значения мощности
    public void addPower(int power) {
//        this.power = this.power + power;
        this.power += power;
    }

    // переназначеие значения поля
    public void setPower(int power) {
        this.power = power;
    }

    //
    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", weight=" + weight +
                ", power=" + power +
                '}';
    }
}

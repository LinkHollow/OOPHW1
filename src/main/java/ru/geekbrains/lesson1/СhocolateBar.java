package ru.geekbrains.lesson1;

public class СhocolateBar extends Product {
    private String type; // Тип шоколада(Молочный, горький и т.д.)

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;

    }

    public СhocolateBar(String brand, String name, double price, String type) {
        super(brand, name, price);
        this.type = type;
    }

    @Override
    public String displayInfo() {
        return String.format("[Плитка шоколада]%s - %s - %f - [Тип: %s]", brand, name, price, type);
    }
}

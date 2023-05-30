package ru.geekbrains.lesson1;

import java.util.List;

public class VendingMachine {

    private final List<Product> products;


    public VendingMachine(List<Product> products) {
        this.products = products;
    }

    public СhocolateBar getChocolateBar(String type){
        for (Product product : products){
            if (product instanceof СhocolateBar){
                if (((СhocolateBar)product).getType()  == type){
                    return (СhocolateBar)product;
                }
            }
        }
        return null;
    }

}

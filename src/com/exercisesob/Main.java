package com.exercisesob;

public class Main {
    public static void main(String[] args) {
    double totalPrice = addTaxes(300);
        System.out.println(totalPrice);

    }

    static double addTaxes(double price){
        double pricePlusTaxes = price+=price * 0.21;
        return pricePlusTaxes;
    }
}

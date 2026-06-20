package edu.pe.utp.patrones_diseno.creacionales.builder.pizza;

public class Principal {

    public static void main(String[] args) {

        Pizza pizza = new Pizza.Builder()

                .setSize("Grande")

                .setDough("Delgada")

                .setCheese("Mozzarella")

                .setTopping("Pepperoni")

                .setSauce("BBQ")

                .build();

        pizza.mostrar();
    }
}
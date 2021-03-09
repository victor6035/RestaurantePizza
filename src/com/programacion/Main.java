package com.programacion;

public class Main {

    public static void main(String[] args) {

      /*  Pizzas pizzaMargarita= new Pizzas();


        pizzaMargarita.setTipo(1);
        pizzaMargarita.setMasa("fina");
        pizzaMargarita.setSalsa(true);
        pizzaMargarita.setTipoSalsa(" salsa de tomate ");
        pizzaMargarita.setOregano(true);
        pizzaMargarita.setQuesoMozzarella(true);
        pizzaMargarita.setAceiteOliva(true);
        pizzaMargarita.setAlbahaca(true);
        pizzaMargarita.setCebolla(false);
        pizzaMargarita.setChampiñones(false);
        pizzaMargarita.setJamon(false);

        String mostrarPizza = pizzaMargarita.toString();
        System.out.println(mostrarPizza);

        Pizzas pizzaCarbonara = new Pizzas();

        pizzaCarbonara.setTipo(2);
        pizzaCarbonara.setMasa("masa pan");
        pizzaCarbonara.setCebolla(true);
        pizzaCarbonara.setJamon(true);
        pizzaCarbonara.setExtraQueso(true);
        pizzaCarbonara.setSalsa(true);
        pizzaCarbonara.setTipoSalsa("carbonara");

        String mostrarPizza2 = pizzaCarbonara.toString();
        System.out.println(mostrarPizza2);

        Pizzas pizzasLaCasaXD = new Pizzas();

        pizzasLaCasaXD.setTipo(1);
        pizzasLaCasaXD.setMasa("Integral");
        pizzasLaCasaXD.setSalsa(true);
        pizzasLaCasaXD.setTipoSalsa("barbacoa");
        pizzasLaCasaXD.setJamon(true);
        pizzasLaCasaXD.setChampiñones(true);
        pizzasLaCasaXD.setExtraQueso(true);
        pizzasLaCasaXD.setPeperoni(true);
        pizzasLaCasaXD.setPiña(true);

        String mostrarPizza3 = pizzasLaCasaXD.toString();
        System.out.println(mostrarPizza3);*/

        Pizzas base = new BuilderPizzas()
                .setMasa("pan")
                .setRelleno(true)
                .setCebolla(true)
                .setPiña(true)
                .build();
        Pizzas rellenita = new BuilderPizzas()
                .setRelleno(true)
                .setCebolla(true)
                .setMasa("integral")
                .setSalsa(true)
                .setTipoSalsa("barbacoa")
                .build();


        System.out.println("las pizzas "+base+"\n Pizzas rellenita "+rellenita);
    }
}

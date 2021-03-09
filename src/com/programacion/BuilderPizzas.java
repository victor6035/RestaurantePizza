package com.programacion;

public class BuilderPizzas {
    protected Pizzas _pizza;


    public Pizzas build(){
        return this._pizza;
    }
    // constructor
    public BuilderPizzas() {
        _pizza = new Pizzas();
    }
    public BuilderPizzas setMasa(String tipoMasa){
        _pizza.setMasa(tipoMasa);
        return this;
    }
    public BuilderPizzas setRelleno(boolean relleno){
        _pizza.setRelleno(relleno);
        return this;
    }

    public BuilderPizzas setSalsa(boolean salsa){
        _pizza.setSalsa(salsa);
        return this;
    }
    public BuilderPizzas setTipoSalsa(String tipoSalsa){
        _pizza.setTipoSalsa(tipoSalsa);
        return this;
    }
    public BuilderPizzas setCebolla(boolean cebolla){
        _pizza.setCebolla(cebolla);
        return this;
    }
    public BuilderPizzas setPiña(boolean piña){
        _pizza.setPiña(piña);
        return this;
    }
}

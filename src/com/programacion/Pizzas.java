package com.programacion;

public class Pizzas {


    private String masa;
    private boolean relleno;
    private int tipo;
    private boolean salsa;
    private String tipoSalsa;
    private boolean cebolla;
    private boolean sinGluten;
    private boolean piña;
    private boolean champiñones;
    private boolean ExtraQueso;
    private boolean jamon;
    private boolean albahaca;
    private boolean aceiteOliva;
    private boolean peperoni;
    private boolean quesoMozzarella;
    private boolean oregano;

    public Pizzas() {

    }

    public Pizzas(String masa, boolean relleno, int tipo, boolean salsa, String tipoSalsa, boolean cebolla, boolean sinGluten, boolean piña, boolean champiñones, boolean extraQueso, boolean jamon, boolean albahaca, boolean aceiteOliva, boolean peperoni, boolean quesoMozzarella, boolean oregano) {
        this.masa = masa;
        this.relleno = relleno;
        this.tipo = tipo;
        this.salsa = salsa;
        this.tipoSalsa = tipoSalsa;
        this.cebolla = cebolla;
        this.sinGluten = sinGluten;
        this.piña = piña;
        this.champiñones = champiñones;
        this.ExtraQueso = extraQueso;
        this.jamon = jamon;
        this.albahaca = albahaca;
        this.aceiteOliva = aceiteOliva;
        this.peperoni = peperoni;
        this.quesoMozzarella = quesoMozzarella;
        this.oregano = oregano;
    }

    public String getMasa() {
        return masa;
    }

    public void setMasa(String masa) {
        this.masa = masa;
    }

    public boolean isRelleno() {
        return relleno;
    }

    public void setRelleno(boolean relleno) {
        this.relleno = relleno;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public boolean isSalsa() {
        return salsa;
    }

    public void setSalsa(boolean salsa) {
        this.salsa = salsa;
    }

    public String getTipoSalsa() {
        return tipoSalsa;
    }

    public void setTipoSalsa(String tipoSalsa) {
        this.tipoSalsa = tipoSalsa;
    }

    public boolean isCebolla() {
        return cebolla;
    }

    public void setCebolla(boolean cebolla) {
        this.cebolla = cebolla;
    }

    public boolean isSinGluten() {
        return sinGluten;
    }

    public void setSinGluten(boolean sinGluten) {
        this.sinGluten = sinGluten;
    }

    public boolean isPiña() {
        return piña;
    }

    public void setPiña(boolean piña) {
        this.piña = piña;
    }

    public boolean isChampiñones() {
        return champiñones;
    }

    public void setChampiñones(boolean champiñones) {
        this.champiñones = champiñones;
    }

    public boolean isExtraQueso() {
        return ExtraQueso;
    }

    public void setExtraQueso(boolean extraQueso) {
        ExtraQueso = extraQueso;
    }

    public boolean isJamon() {
        return jamon;
    }

    public void setJamon(boolean jamon) {
        this.jamon = jamon;
    }

    public boolean isAlbahaca() {
        return albahaca;
    }

    public void setAlbahaca(boolean albahaca) {
        this.albahaca = albahaca;
    }

    public boolean isAceiteOliva() {
        return aceiteOliva;
    }

    public void setAceiteOliva(boolean aceiteOliva) {
        this.aceiteOliva = aceiteOliva;
    }

    public boolean isPeperoni() {
        return peperoni;
    }

    public void setPeperoni(boolean peperoni) {
        this.peperoni = peperoni;
    }

    public boolean isQuesoMozzarella() {
        return quesoMozzarella;
    }

    public void setQuesoMozzarella(boolean quesoMozzarella) {
        this.quesoMozzarella = quesoMozzarella;
    }

    public boolean isOregano() {
        return oregano;
    }

    public void setOregano(boolean oregano) {
        this.oregano = oregano;
    }

    @Override
    public String toString() {
        return "Pizzas{" +
                "masa='" + masa + '\'' +
                ", relleno=" + relleno +
                ", tipo=" + tipo +
                ", salsa=" + salsa +
                ", tipoSalsa='" + tipoSalsa + '\'' +
                ", cebolla=" + cebolla +
                ", sinGluten=" + sinGluten +
                ", piña=" + piña +
                ", champiñones=" + champiñones +
                ", ExtraQueso=" + ExtraQueso +
                ", jamon=" + jamon +
                ", albahaca=" + albahaca +
                ", aceiteOliva=" + aceiteOliva +
                ", peperoni=" + peperoni +
                ", quesoMozzarella=" + quesoMozzarella +
                ", oregano=" + oregano +
                '}';
    }
}

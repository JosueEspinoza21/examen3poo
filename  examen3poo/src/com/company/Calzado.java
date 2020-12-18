package com.company;

public abstract class Calzado {
    private String tipoCalzado;
    private double tamaño;
    private String color;
    private String marca;

    public Calzado(double tamaño,String color,String marca){
        this.tamaño=tamaño;
        this.color=color;
        this.marca=marca;
    }

    public String getTipoCalzado() {
        return tipoCalzado;
    }

    public void setTipoCalzado(String tipoCalzado) {
        this.tipoCalzado = tipoCalzado;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    public abstract void file(String filename);

    public String Calzado(){
        return "\nQue bien me quedan estos\t"+tipoCalzado+"\ttalla\t"+tamaño+"\t\n";
                }
    }


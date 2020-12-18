package com.company;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Niños extends Calzado {
    private double costo;

    public Niños(String tipo, double tamaño, String color, String marca, double costo) {
        super(tamaño, color, marca);
        this.costo = costo;

    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    @Override
    public void file(String filename) {
        FileWriter escribirArchivo = null;
        try {
            File archivo = new File(filename);
            escribirArchivo = new FileWriter(archivo, true);

            escribirArchivo.write(Datos());
            escribirArchivo.write(Calzado());


        } catch (IOException ex) {
            System.err.println("Error " + ex);
        } finally {
            try {
                escribirArchivo.close();
            } catch (IOException ex) {

            }
        }
    }
    @Override
    public String Calzado(){
        return super.Calzado();
    }

    @Override
    public String getTipoCalzado() {
        return super.getTipoCalzado();
    }

    @Override
    public void setTipoCalzado(String tipoCalzado) {
        super.setTipoCalzado(tipoCalzado);
    }
    public String Datos() {
        return "Datos Niños\n\n" + "\nTalla:\t" + getTamaño() + "\nMarca:\t" + getMarca() + "\nColor:\t" + getColor() + "\nPrecio:\t" + costo + "\n";
    }
}

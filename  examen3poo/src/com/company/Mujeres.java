package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Mujeres extends Calzado {
    private double costo;
    private String tipo;

    public Mujeres(String tipo, double tamaño, String color, String marca, String codigo, int cantidad, double precio, double descuento) {
        super(tamaño, color, marca);
        this.costo = costo;
        this.tipo = tipo;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void file(String filename) {

        //aca escribire en los archivos de texto mediante el fileWriter
        FileWriter escribirArchivo = null;
        try {
            File archivo = new File(filename);//Creando el archivo de texto
            escribirArchivo = new FileWriter(archivo, true); //vamos a ecribir en un archivo

            escribirArchivo.write(Datos());//vamos a añadir el texto del metodo mostrar datos
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
    public void setTipoCalzado(String tipoCalzado) {
        super.setTipoCalzado(tipoCalzado);
    }

    @Override
    public String getTipoCalzado() {
        return super.getTipoCalzado();
    }

    public String Datos() {
        return "Datos Mujeres\n\n" + "\nTalla:\t" + getTamaño() + "\nMarca:\t" + getMarca() + "\nColor:\t" + getColor() + "\nPrecio:\t" + costo + "\n";
    }

    @Override
    public String Calzado() {
        return super.Calzado();
    }
}
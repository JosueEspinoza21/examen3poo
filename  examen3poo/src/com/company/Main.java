package com.company;
//Utilizando clases y empleando herencia realizar.
//
//Un programa para el inventario de una tienda de zapatos. Está tendrá una clase padre, llamada zapato, este tendrá una propiedad talla (si desea le puede agregar más propiedades)
//
//De ella heredarán 3 clases, ustede definirá los nombres y propiedades de las clases hijas.
//
//La clase padre tendrá un metodo abstracto que implementará polimorfismo, dicho metodo será
//
//void 2File(fileName), este metodo guardará las propiedades de este objeto en un archivo de texto.
//
//La clase padre implementará un metodo String calzar(), devolverá la frase "Que bien me quedan estos NOMBRECLASE que son talla TALLA"
//
//
//
//En el main..
//
//Se le preguntará al usuario que tipo de zapato quiere agregar y segun el tipo le pedirá las cualidades, por cada tipo de zapato, se creará una instancia del objeto, la cual se guardará en un arraylist.
//
//Esto se repetirá hasta el que el usuario desee terminar de crear los zapatos. cuando el usuario decida terminar la ejecucion, se llamará el metodo 2file, para que guarde cada instancia del objeto en un archivo con el nombre que se le dio al zapato.
//
//
//
//Se puede utilizar la clase de manejo de archivos que le pasé.
//
//
//
//Se subirá el examen a su repositorio con el nombre examen3poo, aqui me pondrán el link de su repositorio.//
import java.util.*;

public class Main {


    public static void main(String[] args) {

        Scanner Entrada = new Scanner(System.in);
        Menu(Entrada);
    }


public static void Menu(Scanner Entrada){
    ArrayList<Niños>listaniños= new ArrayList<Niños>();
    ArrayList<Hombres>listahombres= new ArrayList<Hombres>();
    ArrayList<Mujeres>listamujeres= new ArrayList<Mujeres>();

    int Opcion1;

    do{
        System.out.println("\n\t.:Zapateria la Familia:\t"+
                "\n1.Ingresar un clazado de Niños al inventario\t"+
                "\n2.Ingresar una clazado de Hombres al inventario\t"+
                "\n3.Ingresar una clazado de Mujeres inventario\t"+
                "\n4.Salir\n");
    Opcion1=Entrada.nextInt();
    switch (Opcion1){
        case 1:
            Niños niños =  crearniños(Entrada);
            niños.setTipoCalzado("Niños");

            listaniños.add(Niños);

            System.out.println("\n\nAcaba de agregar unos nuevos Zapatos en  el stock de niños\n");
            break;
        case 2:
            Hombres hombres =  crearhombres(Entrada);
            hombres.setTipo("hombres");

            listahombres.add(Hombres);

            System.out.println("\n\nAcaba de agregar unos nuevos Zapatos en  el stock de Hombres\n");
            break;
        case 3:
            Mujeres mujeres =  crearmujeres(Entrada);
            mujeres.setTipo("mujeres");

            listamujeres.add(Mujeres);

            System.out.println("\n\nAcaba de agregar unos nuevos Zapatos en  el stock de Mujeres\n");
            break;
        case 4:
            System.out.println("\n\nGracias por usar nuestros sevicios");
            break;
    }
    }while(Opcion1 != 4);
    for(Niños lista: listaniños){
        lista.file("Niños.txt");
    }

    for(Hombres lista: listahombres){
        lista.file("Hombres.txt");
    }

    for(Mujeres lista: listamujeres){
        lista.file("Mujeres.txt");
    }
}


    public static Niños crearniños(Scanner entrada){

        double tamaño;
        String color;
        String marca;
        double costo;
        String modelo;

        System.out.println("\nUsted escogio ingresar zapato de niño\n");

        do{
            System.out.print("Ingrese la talla zapato: \t");
            tamaño= entrada.nextDouble();

            if(tamaño < 0){
                System.out.println("\n\nTalla incorrecta\n");
            }


        }while (tamaño < 0);
        entrada.nextLine();
        System.out.print("Ingrese el color del zapato:\t ");
        color = entrada.nextLine();



        System.out.print("Ingrese la marca del zapato: \t");
        marca = entrada.nextLine();

        System.out.print("Ingrese el precio del zapato: \t");
        costo= entrada.nextDouble();


        entrada.nextLine();


        System.out.print("Ingrese el modelo del zapato:\t ");
        modelo = entrada.nextLine();


        Niños niños = new Niños(tamaño, color, marca, costo,modelo );

        return Niños;
    }


    public static Hombres crearhombres(Scanner entrada) {
        double tamaño;
        String color;
        String marca;
        double costo;
        String modelo;

        System.out.println("\nUsted escogio ingresar zapato de Hombres\n");

        do {
            System.out.print("Ingrese la talla zapato: \t");
            tamaño = entrada.nextDouble();

            if (tamaño < 0) {
                System.out.println("\n\nTalla incorrecta\n");
            }


        } while (tamaño < 0);
        entrada.nextLine();
        System.out.print("Ingrese el color del zapato:\t ");
        color = entrada.nextLine();


        System.out.print("Ingrese la marca del zapato: \t");
        marca = entrada.nextLine();

        System.out.print("Ingrese el precio del zapato: \t");
        costo = entrada.nextDouble();


        entrada.nextLine();


        System.out.print("Ingrese el modelo del zapato:\t ");
        modelo = entrada.nextLine();


        Hombres hombres= new Hombres(tamaño, color, marca, costo, modelo);

        return Hombres;
    }


    public static Mujeres crearmujeres(Scanner entrada){
        double tamaño;
        String color;
        String marca;
        double costo;
        String modelo;

        System.out.println("\nUsted escogio ingresar zapato de Mujeres\n");

        do{
            System.out.print("Ingrese la talla zapato: \t");
            tamaño= entrada.nextDouble();

            if(tamaño < 0){
                System.out.println("\n\nTalla incorrecta\n");
            }


        }while (tamaño < 0);
        entrada.nextLine();
        System.out.print("Ingrese el color del zapato:\t ");
        color = entrada.nextLine();



        System.out.print("Ingrese la marca del zapato: \t");
        marca = entrada.nextLine();

        System.out.print("Ingrese el precio del zapato: \t");
        costo= entrada.nextDouble();


        entrada.nextLine();


        System.out.print("Ingrese el modelo del zapato:\t ");
        modelo = entrada.nextLine();


        Mujeres mujeres= new Mujeres(tamaño, color, marca, costo,modelo );

        return Mujeres;
    }

}

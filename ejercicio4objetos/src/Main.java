//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import almacen.Articulo;
import java.util.Scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Articulo art1, art2;

        // Esto es para poder pedirle a usuario que ingrese datos //
        Scanner sc=new Scanner(System.in);

        // Estamos usando el contructor para darle precio y nombre a los artículos //
        art1= new Articulo("Nike Pegasus", 85.8);
        art2= new Articulo("Adidas Stabil" , 67.90);

        /* invoco con a1 al metodo , es el objeto actual*/

        if (art1.masBaratoQue(art2)==true){

            System.out.println("El Articulo 1 es mas barato que el articulo 2");
        }
        else
        {
            System.out.println("El Articulo 1 es mas caro o sale lo mismo que el articulo 2");
        }
    }
}
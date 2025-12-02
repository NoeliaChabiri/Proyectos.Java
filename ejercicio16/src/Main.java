import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num, i;
        Scanner sc=new Scanner(System.in);



        do{

            System.out.println("por favor Ingrese un numero menor o igual a diez");
            num=sc.nextInt();

            if(num>10){
                System.out.println("ERROR!!! Ingreso un número mayor a 10!");
            }
            else if(num<=0){
                System.out.println("ERROR!!! Ingreso un número menor al 1");
            }

        } while (num>10 || num<=0);

        System.out.println("número introducido es el :" +num);

    }

}
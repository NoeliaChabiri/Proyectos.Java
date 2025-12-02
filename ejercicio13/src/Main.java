import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num, i, mayor, cantidad, menor;
        menor=100;
        mayor=0;
        i=1;
        cantidad=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("El programa creara números random");
        System.out.println("Cuantos números quiere que se creen?");
        cantidad=sc.nextInt();


        for (i=1 ; i<=cantidad ; i++){

            num=(int) (Math.random()*100)+1;
            System.out.print(" "+num);

            if(num>mayor){
                mayor=num;
            }

            if (num<menor){
                menor=num;
            }

        }

        System.out.print(" \nEl número más alto es: "+mayor);
        System.out.print(" \nEl número más bajo es: "+menor);

    }

}
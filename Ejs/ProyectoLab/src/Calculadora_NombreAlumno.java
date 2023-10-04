import java.sql.SQLOutput;
import java.util.Scanner;
public class Calculadora_NombreAlumno {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int numberone, numbertwo, out;
        out=1;
        while(out!=0) {
            System.out.println("Bienvenido al programa de calculadora del ejercicio del parcial de lab1 del 28/09/2023");
            System.out.println("Porfavor, ingrese una opcion a realizar (Para salir ingrese 0)");
            System.out.println("1) Suma");
            System.out.println("2) Resta");
            System.out.println("3) Multiplicacion");
            System.out.println("4) Division");
            out=sc.nextInt();
            if (out==1) {
                System.out.println("Ingrese el primer numero");
                numberone = sc.nextInt();
                System.out.println("Ingrese el segundo numero");
                numbertwo = sc.nextInt();
                System.out.println("El resultado es: " + (numberone + numbertwo));
                System.out.println("Para salir, escriba 0, para volver a repetir la operacion escriba cualquier otra cosa");
                } else if (out==2){
                System.out.println("Ingrese el primer numero");
                numberone = sc.nextInt();
                System.out.println("Ingrese el segundo numero");
                numbertwo = sc.nextInt();
                System.out.println("El resultado es: " + (numberone - numbertwo));
                System.out.println("Para salir, escriba 0, para volver a repetir la operacion escriba cualquier otra cosa");
            } else if (out==3){
                System.out.println("Ingrese el primer numero");
                numberone = sc.nextInt();
                System.out.println("Ingrese el segundo numero");
                numbertwo = sc.nextInt();
                System.out.println("El resultado es: " + (numberone * numbertwo));
                System.out.println("Para salir, escriba 0, para volver a repetir la operacion escriba cualquier otra cosa");
            } else if(out==4){
                System.out.println("Ingrese el primer numero");
                numberone = sc.nextInt();
                System.out.println("Ingrese el segundo numero");
                numbertwo = sc.nextInt();
                if(numbertwo!=0){
                    System.out.println("El resultado es: " + (numberone / numbertwo));
                    System.out.println("Para salir, escriba 0, para volver a repetir la operacion escriba cualquier otra cosa");
                }else System.out.println("No se puede dividir por cero");
            }else if(out!=0 && out!=1 && out!=2 && out!=3 && out!=4){
                System.out.println("El valor ingresado no corresponde con ninguna de las opciones");
            }
        }
        System.out.println("Gracias por usar esta calculadora, tenga buen dia!");
    }
}

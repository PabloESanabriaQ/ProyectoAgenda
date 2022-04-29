///probando 
/// Despues hago los controles ya que quiero hacer como una funcion
import java.util.Date; 
import java.util.ArrayList;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in); 
       int n=2;
       int boton;///entrada de introduccion 
       int opcion;///entrada de opciones
       System.out.println("se ejecuta");

       while(n==2){
        introduccion();
        boton= entrada.nextInt();
        ///  entrada.skip();///arreglar despues cuando tenga internet xd
        entrada.nextLine();//// momentaneo
        switch(boton){
            case 1: 
                System.out.println("Dime que es lo que quieres ingresar en tu agenda");
                opciones();
                opcion= entrada.nextInt();
                entrada.nextLine();///momentaneo
                    switch (opcion){
                        case 1:
                        break;
                        case 2:
                        break;
                        case 3:
                        break;
                        default:
                        System.out.println("Error dato ingresado fuera de rango");

                    }


            break;
            case 2: 
                System.out.println("Dime lo que quieres eliminar de tu agenda");
                opciones();
                opcion=entrada.nextInt();
                entrada.nextLine();///momentaneo 
                    switch (opcion){
                        case 1:
                        break;
                        case 2:
                        break;
                        case 3:
                        break;
                        default:
                        System.out.println("Error dato ingresado fuera de rango");

                    }
            break;
            case 3: 
                System.out.println("Dime que elementos quieres ver de la agenda");
                opciones();
                opcion= entrada.nextInt();
                entrada.nextLine();///momentaneo
                    switch (opcion){
                        case 1:
                        break;
                        case 2:
                        break;
                        case 3:
                        break;
                        default:
                        System.out.println("Error dato ingresado fuera de rango");

                    }
            break;
            case 4: 
            System.out.println("Gracias por probar nuestro proyecto");
            n=3;
            break;
            default: 
            System.out.println("Lo sentimos, el valor ingresado no esta en el rango establecido");



        }


       }
     
    }
    public static void introduccion(){

            System.out.println("###########################################################################");
            System.out.println("Bienvenido a nuestro proyecto");
            System.out.println("###########################################################################");
            System.out.println("1:Ingresar ");
            System.out.println("2:Eliminar");
            System.out.println("3: Ver");
            System.out.println("4: Cerrar el progrma");
    }
    public static void opciones(){
        System.out.println("1: Tareas");
        System.out.println("2: Eventos");
        System.out.println("3: Recordatorios");

    }
    
}

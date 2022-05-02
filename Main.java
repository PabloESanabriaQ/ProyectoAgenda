import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.LocalTime;
//import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in); 
        ////parametros de los constructores
        String nombre;
        String descripcion;
        String lugar;
        int id_tareas , id_evento, id_recordatorio;///creo un id para cada tipo de clase, para la opcion eliminar
        int dia, mes, año;
        LocalDate fecha;
        LocalTime hora= LocalTime.of(0,0);
        
        ///
        ///creo un arraylist para cada clase
        //Podemos usar el mismo arraylist para todos, ¿no? Si quieren hacerlo en distintos puede ser, pero mepa que con uno anda. Pablo.
        ArrayList<Agenda> lista_recordatorio=new ArrayList<>();
        //ArrayList<Evento> lista_evento=new ArrayList<>();
        //ArrayList<Tareas> lista_tareas=new ArrayList<>();
       int n=2;
       int boton;///entrada de introduccion 
       int opcion;///entrada de opciones
       System.out.println("se ejecuta");

       while(n==2){
        introduccion();
        boton= entrada.nextInt();
        entrada.skip("\n");
        switch(boton){
            case 1: 
                System.out.println("Dime que es lo que quieres ingresar en tu agenda");
                opciones();
                opcion= entrada.nextInt();
                entrada.skip("\n");
                    switch (opcion){
                        case 1:

           
                        break;
                        case 2:
                            

                        break;
                        case 3:
                            //Como .size() devuelve el tamaño del array puedo usar ese número para el próximo ingreso!
                            int tamanio = lista_recordatorio.size();
                            int ultimo_id = lista_recordatorio.indexOf(lista_recordatorio.get(tamanio - 1));
                            if(tamanio < ultimo_id){
                                id_recordatorio = ultimo_id;
                            } else {
                                id_recordatorio = lista_recordatorio.size();
                            }
                            System.out.println("Dime el titulo del recordatorio: ");
                            nombre=entrada.nextLine();
                            System.out.println("Dime el recordatorio");
                            descripcion=entrada.nextLine();
                            System.out.println("Dime el lugar del recordatorio");///capaz que no va para recordatorio
                            lugar=entrada.nextLine();
                            System.out.println("Dime la fecha del recordatorio:");
                            System.out.println("año");
                            año= entrada.nextInt();
                            entrada.skip("\n");
                            System.out.println("mes");
                            mes= entrada.nextInt();
                            entrada.skip("\n");
                            System.out.println("dia");
                            dia= entrada.nextInt();
                            entrada.skip("\n");
                            fecha=LocalDate.of(año,mes,dia);///pongo la fecha ingresada en un variable localdate
                            LocalDateTime fecha_hora = LocalDateTime.of(fecha,hora);
                            lista_recordatorio.add(new Agenda(id_recordatorio,nombre,descripcion,lugar,fecha_hora));
                            //id_recordatorio=id_recordatorio+1;
                        break;
                        default:
                        System.out.println("Error dato ingresado fuera de rango");

                    }


            break;
            case 2: 
                System.out.println("Dime lo que quieres eliminar de tu agenda");
                opciones();
                opcion=entrada.nextInt();
                entrada.skip("\n");
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
                entrada.skip("\n");
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
            System.out.println("4: Cerrar el programa");
    }
    public static void opciones(){
        System.out.println("1: Tareas");
        System.out.println("2: Eventos");
        System.out.println("3: Recordatorios");

    }
    
}

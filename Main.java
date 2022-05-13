import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); 
        ArrayList<Agenda> lista_recordatorio=new ArrayList<>();///arraylist donde se almacena elementos tipo agenda
        ArrayList<Evento> lista_evento= new ArrayList<>();///Arraylist donde se almacena elementos tipos evento
        ArrayList<Tareas> lista_tareas=new ArrayList<>();///Arraylist donde se almacenan elementos tipos tareas
        ////parametros de los constructores
        ArrayList<String> invitados = new ArrayList<>();
        ArrayList<String> tareas = new ArrayList<>();
        LocalDateTime fecha_inicio = LocalDateTime.now();
        LocalDateTime fecha_final;
        String nombre;
        String descripcion;
        String lugar;
        int id_tareas , id_evento, id_recordatorio;///creo un id para cada tipo de clase, para la opcion eliminar
        id_recordatorio = 0;
        id_tareas = 0;
        id_evento = 0;
        int dia, mes, año;///dia mes año que le pido al usuario
        int horas, minutos;///horas y minutos que le pido al usuario
        int cantidad_tareas;///la cantidad de tareas que va almacenar e usuario en la arraylist tareas de la clase tareas
        LocalDate fecha;
        LocalTime hora= LocalTime.of(0,0);
        LocalDateTime c= LocalDateTime.now();
        
        

        ///Forma de presentar la fecha y hs
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MMM-yy");
        
        int numero_recordatorio;///Lugar que desea eliminar el usuario lista recordatotio
        
        int n = 2;
        int boton;///Entrada de introduccion 
        int opcion;///Entrada de opciones
        System.out.println("###########################################################################");
        System.out.println("Bienvenido a nuestro proyecto");
        System.out.println("###########################################################################");
        
        while(n == 2){
            System.out.println("");
            introduccion();
            boton = entrada.nextInt();
            entrada.nextLine();
            
            switch(boton){
                case 1: 
                    System.out.println("Dime que es lo que quieres ingresar en tu agenda");
                    opciones();
                    opcion = entrada.nextInt();
                    entrada.nextLine();
                        switch (opcion){
                            case 1:
                                System.out.println("Dime el titulo del conjunto de tareas: ");
                                nombre = entrada.nextLine();
                                System.out.println("Dime la descripcion del conjunto de tareas");
                                descripcion = entrada.nextLine();
                                System.out.println("Dime el lugar donde se realizara las tarea");///capaz que no va para recordatorio
                                lugar = entrada.nextLine();
                                System.out.println("Dime la fecha de inicio de las tareas:");
                                System.out.println("año");
                                año = entrada.nextInt();
                                entrada.nextLine();
                                System.out.println("mes");
                                mes = entrada.nextInt();
                                entrada.nextLine();
                                System.out.println("dia");
                                dia = entrada.nextInt();
                                entrada.nextLine();
                                fecha = LocalDate.of(año,mes,dia);///pongo la fecha ingresada en un variable localdate
                                fecha_inicio=LocalDateTime.of(fecha,hora);
                                System.out.println("Dime la fecha Final de las tareas:");
                                System.out.println("año");
                                año = entrada.nextInt();
                                entrada.nextLine();
                                System.out.println("mes");
                                mes = entrada.nextInt();
                                entrada.nextLine();
                                System.out.println("dia");
                                dia = entrada.nextInt();
                                entrada.nextLine();
                                fecha = LocalDate.of(año,mes,dia);
                                System.out.println("Dime la hs limite a terminar las tareas");
                                System.out.println("HS: ");
                                horas= entrada.nextInt();
                                entrada.nextLine();
                                System.out.println("Minutos: ");
                                minutos=entrada.nextInt();
                                entrada.nextLine();
                                hora=LocalTime.of(horas,minutos);
                                fecha_final=LocalDateTime.of(fecha,hora);
                                System.out.println("Dime la cantidad de tareas que vas a realizar en el periodo de tiempo especificado");
                                cantidad_tareas=entrada.nextInt();
                                entrada.nextLine();
                                for(int i=0; i<cantidad_tareas;i++){
                                    System.out.println("Tarea "+(i+1)+":");
                                    tareas.add(i ,entrada.nextLine());

                                }
                                lista_tareas.add(new Tareas(id_tareas, nombre, descripcion, lugar, fecha_inicio, fecha_final, tareas));



                                
                                

            
                                break;
                            case 2:
                                

                                break;
                            case 3:
                                //Como .size() devuelve el tamaño del array puedo usar ese número para el próximo ingreso!
                                // Si el tamaño es menor al id del último valor agregado (porque se puede haber eliminado algo) entonces usamos ese id como referencia.
                                ///Eber: lo puse entre comillas porque no lo entiendo
                                
                                /*int tamanio = lista_recordatorio.size();
                                int ultimo_id = lista_recordatorio.indexOf(lista_recordatorio.get(tamanio - 1));
                                if(tamanio < ultimo_id){
                                    id_recordatorio = ultimo_id +1;
                                } else {
                                    id_recordatorio = lista_recordatorio.size();
                                }
                                */
                                
                                System.out.println("Dime el titulo del recordatorio: ");
                                nombre = entrada.nextLine();
                                System.out.println("Dime el recordatorio");
                                descripcion = entrada.nextLine();
                                System.out.println("Dime el lugar del recordatorio");///capaz que no va para recordatorio
                                lugar = entrada.nextLine();
                                System.out.println("Dime la fecha del recordatorio:");
                                System.out.println("año");
                                año = entrada.nextInt();
                                entrada.nextLine();
                                System.out.println("mes");
                                mes = entrada.nextInt();
                                entrada.nextLine();
                                System.out.println("dia");
                                dia = entrada.nextInt();
                                entrada.nextLine();
                                fecha=LocalDate.of(año,mes,dia);///pongo la fecha ingresada en un variable localdate
                                fecha_inicio = LocalDateTime.of(fecha,hora);
                                lista_recordatorio.add(new Agenda(id_recordatorio,nombre,descripcion,lugar,fecha_inicio));
                                id_recordatorio = id_recordatorio+1;
                                break;
                            default:
                                System.out.println("Error - Dato ingresado fuera de rango");
                                break;
                        }
                    break;
                case 2: 
                    System.out.println("Dime lo que quieres eliminar de tu agenda");
                    opciones();
                    opcion = entrada.nextInt();
                    entrada.nextLine();
                        switch (opcion){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                System.out.println("Dime el numero del recordatorio, si no estas seguro ve a la opcion ver");
                                numero_recordatorio = entrada.nextInt();
                                entrada.nextLine();
                                lista_recordatorio.remove(numero_recordatorio-1);
                                id_recordatorio = id_recordatorio-1;
                                break;
                            default:
                                System.out.println("Error - Dato ingresado fuera de rango");
                                break;
                        }
                    break;
                case 3: 
                    System.out.println("Dime que elementos quieres ver de la agenda");
                    opciones();
                    opcion = entrada.nextInt();
                    entrada.nextLine();
                        switch (opcion){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                int hay_elemento=0;
                                for(int i=0; i<lista_recordatorio.size();i++){
                                    System.out.println("numero de recordatorio: "+ ((lista_recordatorio.get(i).getId())+1));
                                    System.out.println("Titulo: "+ lista_recordatorio.get(i).getNombre());
                                    System.out.println("Descripcion: "+ lista_recordatorio.get(i).getDescripcion());
                                    System.out.println("Lugar: "+ lista_recordatorio.get(i).getLugar());
                                    System.out.println("Fecha: "+ lista_recordatorio.get(i).getFechaInicio().format(f));
                                    System.out.println("");
                                    hay_elemento = 1;
                                }
                                
                                if(hay_elemento == 0){
                                    System.out.println("Lo sentimos, no hay un recordatorio en esta lista");
                                }
                                hay_elemento=0;
                                
                                break;
                            default:
                                System.out.println("Error - Dato ingresado fuera de rango");
                                break;
                        }
                    break;
                case 4: 
                    System.out.println("###########################################################################");
                    System.out.println("Gracias por probar nuestro proyecto");
                    System.out.println("###########################################################################");
                    n = 3;
                    break;
                default: 
                    System.out.println("Lo sentimos, el valor ingresado no esta en el rango establecido");
                    break;
            }


       }
     
    }
    public static void introduccion(){
        System.out.println("1: Ingresar");
        System.out.println("2: Eliminar");
        System.out.println("3: Ver");
        System.out.println("4: Cerrar el programa");
    }
    public static void opciones(){
        System.out.println("1: Tareas");
        System.out.println("2: Eventos");
        System.out.println("3: Recordatorios");
    }
}

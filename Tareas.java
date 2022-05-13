//clase hijo tareas 
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Tareas extends Agenda{
   protected LocalDateTime fechaFin;
   ArrayList<String> tareas; 
   Tareas(int id, String nombre, String descripcion,String lugar, LocalDateTime fechaInicio, LocalDateTime fechaFin, ArrayList<String> tareas ){
       super(id, nombre,  descripcion,lugar,  fechaInicio);///estaban declaradas asi que le saque la declaracion.Eber 
       this.fechaFin = fechaFin;
       this.tareas = tareas;
   }
    public LocalDateTime getFechaFin(){///otra correccion que me falto, cambiar date por localdatetime 
        return this.fechaFin;
    }
}

//clase Hijo - Tareas 
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Tareas extends Agenda{
    protected LocalDateTime fechaFin;
    ArrayList<String> tareas;
    
    Tareas(int id, String nombre, String descripcion, String lugar, LocalDateTime fechaInicio, LocalDateTime fechaFin, ArrayList<String> tareas){
        super(id, nombre,  descripcion,lugar,  fechaInicio);
        this.fechaFin = fechaFin;
        this.tareas = tareas;
    }

    public LocalDateTime getFechaFin(){
        return this.fechaFin;
    }
}

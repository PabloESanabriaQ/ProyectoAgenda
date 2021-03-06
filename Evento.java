//Clase Hijo - Evento
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Evento extends Agenda{
    protected LocalDateTime fechaFin;
    ArrayList<String> invitados;

    Evento(int id, String nombre, String descripcion, String lugar, ArrayList<String> invitados, LocalDateTime fechaInicio, LocalDateTime fechaFin){
        super(id, nombre, descripcion, lugar, fechaInicio);
        this.fechaFin = fechaFin;
        this.invitados = invitados;
    }

    public LocalDateTime getFechaFin(){
        return this.fechaFin;
    }
}
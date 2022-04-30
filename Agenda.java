import java.time.LocalDateTime;

public class Agenda {
    //Creo la clase agenda con los atributos que va a heredar a las clases hijas.
    protected int id;
    protected String nombre;
    protected String descripcion;
    protected String lugar;
    protected LocalDateTime fechaInicio;

    //Constructor con todos los atributos;
    Agenda(int id, String nombre, String descripcion, String lugar, LocalDateTime fechaInicio){
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.lugar = lugar;
        this.fechaInicio = fechaInicio;
    }

    //Getter y setter para todos los atributos excepto el atributo id y fecha.

    public int getId(){
        return this.id;
    }

    public String getNombre(){
        return this.nombre;
    }

    public String getDescripcion(){
        return this.descripcion;
    }

    public String getLugar(){
        return this.lugar;
    }

    public LocalDateTime getFechaInicio(){
        return this.fechaInicio;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }    
}

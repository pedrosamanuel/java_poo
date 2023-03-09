import java.time.LocalDate;
import java.time.LocalDateTime;

public class Persona {
    private String nombre;
    private String apellido;
    private LocalDateTime fecha_de_nacimiento;

    public Persona(String nombre, String apellido, LocalDateTime fecha_de_nacimiento ){
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha_de_nacimiento = fecha_de_nacimiento;
    }
}

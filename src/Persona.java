import java.time.LocalDate;
import java.time.LocalDateTime;

public class Persona {
    private String nombre;
    private String apellido;
    private LocalDateTime fechaDeNacimiento;

    public Persona(String nombre, String apellido, LocalDateTime fechaDeNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
}

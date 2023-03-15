import java.time.LocalDateTime;

public class Persona {
    private final String nombre;
    private final String apellido;
    private final LocalDateTime fechaDeNacimiento;

    public Persona(String nombre, String apellido, LocalDateTime fechaDeNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
}

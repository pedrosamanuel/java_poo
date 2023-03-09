import java.time.LocalDate;

public class Carrito {
    private Persona persona;
    public static Producto[] productos;
    private LocalDate fechaCompra;

    public Carrito(Persona persona, Producto[] productos){
        this.persona = persona;
        this.productos = productos;
        this.fechaCompra = LocalDate.now();
    }
    public static float precios(Producto[] p){
        float suma = 0;
        for(int i = 0; i < p.length ; i++){
            suma = suma + p.precio[i];
        }
        return suma;

    }




}

public class Producto {
    private final String nombre;
    private final String codigo;
    private final float precio;


    public Producto(String nombre, String codigo, float precio) {
        this.codigo = codigo;
        this.precio = precio;
        this.nombre = nombre;


    }

    public float getPrecio() {
        return precio;
    }


}

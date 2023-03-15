public class Producto {
    private final String nombre;
    private final String codigo;
    private final float precio;

    public Producto(String nombre, String codigo, float precio) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;

    }

    public float getPrecio() {
        return precio;
    }

}

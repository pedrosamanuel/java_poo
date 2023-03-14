public class Producto {
    private String nombre;
    private String codigo;
    private float precio;

    public Producto(String nombre, String codigo, float precio) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;

    }

    public float getPrecio() {
        return precio;
    }

}

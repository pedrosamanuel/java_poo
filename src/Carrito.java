import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Carrito {
    private final Persona persona;
    private final LocalDate fechaCompra;
    private final List<Producto> productos;

    public Carrito(Persona persona) {
        this.persona = persona;
        this.productos = new ArrayList<Producto>();
        this.fechaCompra = LocalDate.now();
    }

    public static float precios(List<Producto> p) throws PrecioCeroException {

        float suma = 0;
        for (int i = 0; i < p.size(); i++) {
            suma = suma + p.get(i).getPrecio();
        }
        if (suma == 0) {
            throw new PrecioCeroException();
        } else {
            return suma;
        }

    }

    public void agregarCarrito(Producto p) {
        this.productos.add(p);

    }

    public void quitarCarrito(Producto p) {
        this.productos.remove(p);
    }

    public List<Producto> getProductos() {
        return productos;
    }


}

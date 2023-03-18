import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Persona carlos = new Persona("Carlos", "Diaz", LocalDateTime.parse("2003-10-21T00:00:00"));
        Producto esponja = new Producto("Esponja", "8888", 10);
        Producto jabonEnPolvo = new Producto("Jabón en polvo", "9999", 40);
        Producto chocolate = new Producto("Chocolate", "7777", 100);
        Descuento descPorcentaje = new DescuentoPorcentaje();
        descPorcentaje.setValor(0.3f);
        Descuento descPorcentajeTope = new DescuentoPorcConTope();
        descPorcentajeTope.setValor(0.3f);
        Descuento descFijo = new DescuentoFijo();
        descFijo.setValor(151);
        Carrito miCarro = new Carrito(carlos);
        miCarro.agregarCarrito(esponja);
        miCarro.agregarCarrito(jabonEnPolvo);
        miCarro.agregarCarrito(chocolate);


        try {
            float precioFinal = Carrito.precios(miCarro.getProductos());
            try {
                precioFinal = descPorcentaje.valorFinal(precioFinal, 40);
                System.out.println(precioFinal);
            } catch (DescuentoNeg e) {
                System.out.println("El resultado del descuento es un monto negativo o 0");
            }


        } catch (PrecioCeroException e) {
            System.out.println("El carrito tiene precio 0");
        }


    }
}
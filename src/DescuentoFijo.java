public class DescuentoFijo extends Descuento {

    @Override
    public float valorFinal(float valorInicial, float tope) {
        return valorInicial - this.getValor();
    }
}

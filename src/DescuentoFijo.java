public class DescuentoFijo extends Descuento {

    @Override
    public float valorFinal(float valorInicial, float tope) throws DescuentoNeg {
        if (valorInicial - this.getValor() <= 0) {
            throw new DescuentoNeg();
        }

        return valorInicial - this.getValor();
    }
}

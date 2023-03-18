public class DescuentoPorcentaje extends Descuento {
    @Override
    public float valorFinal(float valorInicial, float tope) throws DescuentoNeg {
        if (valorInicial - (valorInicial * this.getValor()) <= 0) {
            throw new DescuentoNeg();
        }

        return valorInicial - (valorInicial * this.getValor());
    }
}

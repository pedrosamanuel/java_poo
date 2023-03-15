public class DescuentoPorcentaje extends Descuento {
    @Override
    public float valorFinal(float valorInicial, float tope) {
        return valorInicial - (valorInicial * this.getValor());
    }
}

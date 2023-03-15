public class DescuentoPorcConTope extends Descuento {
    @Override
    public float valorFinal(float valorInicial, float tope) {
        if (valorInicial * getValor() < tope) {
            return valorInicial - valorInicial * this.getValor();
        } else {
            return valorInicial - tope;
        }
    }
}

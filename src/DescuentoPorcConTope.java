public class DescuentoPorcConTope extends Descuento {
    @Override
    public float valorFinal(float valorInicial, float tope) throws DescuentoNeg {


        if (valorInicial * getValor() < tope) {
            if (valorInicial - valorInicial * this.getValor() <= 0) {
                throw new DescuentoNeg();
            }
            return valorInicial - valorInicial * this.getValor();
        } else {
            if (valorInicial - tope <= 0) {
                throw new DescuentoNeg();
            }
            return valorInicial - tope;
        }
    }
}

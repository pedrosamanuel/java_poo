public abstract class Descuento {
    private float valor;

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public abstract float valorFinal(float valorInicial, float tope) throws DescuentoNeg;


}

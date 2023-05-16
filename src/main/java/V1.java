public class V1 extends Modelo {

    public V1(float valorBase) {
        super(valorBase);
    }

    public float calcularValor() {
        return this.valorBase * (1 + this.cor.percentualAumento());
    }
}

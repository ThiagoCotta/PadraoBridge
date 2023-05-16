public class V3 extends Modelo {

    public V3(float valorBase) {
        super(valorBase);
    }

    public float calcularValor() {
        return this.valorBase * (1 + this.cor.percentualAumento());
    }
}

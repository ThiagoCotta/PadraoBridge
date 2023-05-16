public class V2 extends Modelo {

    public V2(float valorBase) {
        super(valorBase);
    }

    public float calcularValor() {
        return this.valorBase * (1 + this.cor.percentualAumento());
    }
}

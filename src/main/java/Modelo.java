public abstract class Modelo {

    protected Cor cor;

    protected float valorBase;

    public Modelo(float valorBase) {
        this.valorBase = valorBase;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }

    public void setValorBase(float valorBase) {
        this.valorBase = valorBase;
    }

    public abstract float calcularValor();
}

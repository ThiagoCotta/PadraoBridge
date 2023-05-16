import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class V1Test {

    @Test
    void deveRetornarValorModeloV1CorBranca() {
        Cor cor = new Branco();
        V1 modeloV1 = new V1(2300.0f);
        modeloV1.setCor(cor);
        assertEquals(2300.0f, modeloV1.calcularValor(), 0.01f);
    }

    @Test
    void deveRetornarValorModeloV1CorPreto() {
        Cor cor = new Preto();
        V1 modeloV1 = new V1(2300.0f);
        modeloV1.setCor(cor);
        assertEquals(2530.0f, modeloV1.calcularValor(), 0.01f);
    }

    @Test
    void deveRetornarValorModeloV1CorCinza() {
        Cor cor = new Cinza();
        V1 modeloV1 = new V1(2300.0f);
        modeloV1.setCor(cor);
        assertEquals(2990.0f, modeloV1.calcularValor(), 0.01f);
    }
}
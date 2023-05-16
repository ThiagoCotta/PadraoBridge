import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class V3Test {

    @Test
    void deveRetornarValorModeloV3CorBranca() {
        Cor cor = new Branco();
        V1 modeloV1 = new V1(3140.0f);
        modeloV1.setCor(cor);
        assertEquals(3140.0f, modeloV1.calcularValor(), 0.01f);
    }

    @Test
    void deveRetornarValorModeloV3CorPreto() {
        Cor cor = new Preto();
        V1 modeloV1 = new V1(3140.0f);
        modeloV1.setCor(cor);
        assertEquals(3454.0f, modeloV1.calcularValor(), 0.01f);
    }

    @Test
    void deveRetornarValorModeloV3CorCinza() {
        Cor cor = new Cinza();
        V1 modeloV1 = new V1(3140.0f);
        modeloV1.setCor(cor);
        assertEquals(4081.9998f, modeloV1.calcularValor(), 0.01f);
    }
}
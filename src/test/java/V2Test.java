import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class V2Test {

    @Test
    void deveRetornarValorModeloV2CorBranca() {
        Cor cor = new Branco();
        V1 modeloV1 = new V1(2900.0f);
        modeloV1.setCor(cor);
        assertEquals(2900.0f, modeloV1.calcularValor(), 0.01f);
    }

    @Test
    void deveRetornarValorModeloV2CorPreto() {
        Cor cor = new Preto();
        V1 modeloV1 = new V1(2900.0f);
        modeloV1.setCor(cor);
        assertEquals(3190.0f, modeloV1.calcularValor(), 0.01f);
    }

    @Test
    void deveRetornarValorModeloV2CorCinza() {
        Cor cor = new Cinza();
        V1 modeloV1 = new V1(2900.0f);
        modeloV1.setCor(cor);
        assertEquals(3769.9998f, modeloV1.calcularValor(), 0.01f);
    }
}
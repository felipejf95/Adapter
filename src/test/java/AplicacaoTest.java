import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AplicacaoTest {

    @Test
    public void deveRetornarSinalBarra(){
        Aplicacao aplicacao = new Aplicacao();
        aplicacao.setSinal(4);

        assertEquals(4, aplicacao.getSinal());
    }

    public void deveRetornarSinalPorcentagem(){
        Aplicacao aplicacao = new Aplicacao();
        aplicacao.setSinal(4);

        assertEquals(1.0f, aplicacao.getSinalPorcentagem());

    }

}
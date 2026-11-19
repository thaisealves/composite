package composite.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

class ClubeTest {

    @Test
    void deveRetornarCronogramaClube() {
        Fase fase1 = new Fase("O Hobbit");

        Fase fase2 = new Fase("O Senhor dos Anéis");
        Sessao sessao21 = new Sessao("A Sociedade do Anel", 178);
        Sessao sessao22 = new Sessao("As Duas Torres", 179);
        Sessao sessao23 = new Sessao("O Retorno do Rei", 201);
        fase2.addItem(sessao21);
        fase2.addItem(sessao22);
        fase2.addItem(sessao23);

        Fase fase3 = new Fase("Os Anéis de Poder");
        Sessao sessao31 = new Sessao("Temporada 1", 480);
        fase3.addItem(sessao31);

        Fase maratona = new Fase("Maratona Terra-média");
        maratona.addItem(fase1);
        maratona.addItem(fase2);
        maratona.addItem(fase3);

        Clube clube = new Clube("Clube de Fantasia");
        clube.setCronograma(maratona);

        assertEquals("Fase: Maratona Terra-média\n" +
                "Fase: O Hobbit\n" +
                "Fase: O Senhor dos Anéis\n" +
                "Sessão: A Sociedade do Anel - duração: 178 min\n" +
                "Sessão: As Duas Torres - duração: 179 min\n" +
                "Sessão: O Retorno do Rei - duração: 201 min\n" +
                "Fase: Os Anéis de Poder\n" +
                "Sessão: Temporada 1 - duração: 480 min\n", clube.getCronograma());
    }

    @Test
    void deveRetornarCronogramaComSessaoUnica() {
        Clube clube = new Clube("Clube de Terror");
        clube.setCronograma(new Sessao("O Iluminado", 146));

        assertEquals("Sessão: O Iluminado - duração: 146 min\n", clube.getCronograma());
    }

    @Test
    void deveRetornarCronogramaComFaseVazia() {
        Clube clube = new Clube("Clube de Ficção Científica");
        clube.setCronograma(new Fase("Duna"));

        assertEquals("Fase: Duna\n", clube.getCronograma());
    }

    @Test
    void deveRetornarExcecaoClubeSemCronograma() {
        try {
            Clube clube = new Clube("Clube de Fantasia");
            clube.getCronograma();
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Clube sem cronograma", e.getMessage());
        }
    }
}

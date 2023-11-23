import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TecnicoTest {

    @Test
    void deveContarJogadoresDisponiveis(){
        Equipe equipe = new Equipe(
                new Jogador("Ze", true),
                new Jogador("Mario", true),
                new Jogador("Carlos", true),
                new Jogador("Joao", false),
                new Jogador("Neymar", false)
        );
        assertEquals(3, Tecnico.contarJogadoresDisponiveis(equipe));
    }

    @Test
    void deveContarTotalJogadores(){
        Equipe equipe = new Equipe(
                new Jogador("Ze", true),
                new Jogador("Mario", true),
                new Jogador("Carlos", true),
                new Jogador("Joao", false),
                new Jogador("Neymar", false)
        );
        assertEquals(5, Tecnico.contarTotalJogadores(equipe));
    }

}
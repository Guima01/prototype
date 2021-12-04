import static org.junit.jupiter.api.Assertions.*;

class PersonagemTest {

    @org.junit.jupiter.api.Test
    void deveRetornarPersonagemOriginalEClone() throws CloneNotSupportedException {
        Personagem personagem = new Personagem(12, "Player Original",  new Atributos  (22, 15, 45), 1200 );

        Personagem personagemClone = personagem.clone();
        personagemClone.setLevel(40);
        personagemClone.setNome("Player Clonado");
        personagemClone.getAtributos().setForca(200);

        assertEquals("Player level=12, nome='Player Original', atributos= forca=22,  defesa=15, magia=45, xp=1200", personagem.toString());
        assertEquals("Player level=40, nome='Player Clonado', atributos= forca=200,  defesa=15, magia=45, xp=1200", personagemClone.toString());
    }
}
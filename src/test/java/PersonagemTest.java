import static org.junit.jupiter.api.Assertions.*;

class PersonagemTest {

    @org.junit.jupiter.api.Test
    void deveRetornarPersonagemOriginalEClone() throws CloneNotSupportedException {
        Personagem personagem = new Personagem(12, "Guima",  new Atributos  (22, 15, 45), 1200 );

        Personagem personagemClone = personagem.clone();
        personagemClone.setLevel(40);
        personagemClone.setNome("Guima bolado");
        personagemClone.getAtributos().setForca(200);

        assertEquals("Personagem level=12, nome='Guima', atributos= forca=22,  defesa=15, magia=45, xp=1200", personagem.toString());
        assertEquals("Personagem level=40, nome='Guima bolado', atributos= forca=200,  defesa=15, magia=45, xp=1200", personagemClone.toString());
    }
}
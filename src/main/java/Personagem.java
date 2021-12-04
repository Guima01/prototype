public class Personagem implements Cloneable{

    private int level;
    private String nome;
    private Atributos atributos;
    private int xp;

    public Personagem(int level, String nome, Atributos atributos, int xp) {

        this.level = level;
        this.nome = nome;
        this.atributos = atributos;
        this.xp = xp;

    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Atributos getAtributos() {
        return atributos;
    }

    public void setAtributos(Atributos atributos) {
        this.atributos = atributos;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public Personagem clone() throws CloneNotSupportedException{
        Personagem personagemClone = (Personagem) super.clone();
        personagemClone.atributos = (Atributos) personagemClone.atributos.clone();
        return personagemClone;
    }

    public String toString() {
        return
                "Personagem level=" + level +
                        ", nome='" + nome + "'"+
                        ", atributos=" + atributos +
                        ", xp=" + xp ;
    }
}

public class Atributos implements Cloneable {
    private Integer forca;
    private Integer defesa;
    private Integer magia;


    public Atributos(Integer forca, Integer defesa, Integer magia ){
        super();

        this.forca = forca;
        this.defesa = defesa;
        this.magia = magia;

    }

    public Integer getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public Integer getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public Integer getMagia() {
        return magia;
    }

    public void setMagia(int magia) {
        this.magia = magia;
    }

    public Object clone() throws  CloneNotSupportedException{
        return super.clone();
    }

    public String toString(){

        return
                " forca=" + forca + "," +
                        "  defesa=" + defesa + "," +
                        " magia=" + magia ;
    }
}

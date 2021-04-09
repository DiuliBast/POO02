import java.io.Serializable;

public class Foto extends Mídia implements Serializable {
    private String fotografo;
    private int pessoas;
    private String local;
    private String data;

    public Foto(String titulo, String descricao, String caminho, String fotografo, int pessoas, String local, String data) {
        super(titulo, descricao, caminho);
        this.fotografo = fotografo;
        this.pessoas = pessoas;
        this.local = local;
        this.data = data;
    }

    public Foto (){

    }

    public String getFotografo() {
        return fotografo;
    }

    public void setFotografo(String Fotografo) {
        this.fotografo = fotografo;
    }

    public int getPessoas() {
        return pessoas;
    }

    public void setPessoas(int pessoas) {
        this.pessoas = pessoas;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getData() {
        return data;
    }

    public void setData() {
        this.data = data;
    }


    public String toString() {
        return  " " + "\n" +
                "Título = " + getTitulo() + "\n" +
                "Descrição = " + getDescricao() + "\n" +
                "Caminho = " + getCaminho() + "\n" +
                "Fotógrafo = " + getFotografo() + "\n" +
                "Pessoas = " + getPessoas() + "\n" +
                "Local = " + getLocal() + "\n" +
                "Data = " + getData() +
                " " + "\n" +
                "----------------------------------- " + "\n" +
                " ";

    }

}

import java.io.Serializable;

public class Foto extends Mídia implements Serializable {
    private String fotografo;
    private String pessoas;
    private String local;
    private String data;

    public Foto(String titulo, String descricao, String caminho, String fotografo, String pessoas, String local,String data) {
        super(titulo, descricao, caminho);
        this.fotografo = fotografo;
        this.pessoas = pessoas;
        this.local = local;
        this.data = data;
    }

    public Foto(){

    }

    public String getFotografo() {
        return fotografo;
    }

    public void setFotografo(String fotografo) {
        this.fotografo = fotografo;
    }

    public String getPessoas() {
        return pessoas;
    }

    public void setPessoas(String pessoas) {
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

    public void setData(String data) {
        this.data = data;
    }


    public String toString() {
        return  " " + "\n" +
                " ------------- (FOTO) ------------- " + "\n" +
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
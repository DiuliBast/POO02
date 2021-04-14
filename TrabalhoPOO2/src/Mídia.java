import java.io.Serializable;

public abstract class Mídia extends ArrayMidias implements Serializable {

    private String titulo;
    private String descricao;
    private String caminho;

    public Mídia(String titulo, String descricao, String caminho) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.caminho = caminho;
    }

    public Mídia(){
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCaminho() {
        return caminho;
    }

    public void setCaminho(String caminho) {
        this.caminho = caminho;
    }
    

}

public class Filme {

    private String titulo;
    private String descricao;
    private String genero;
    private String idioma;
    private String diretor;
    private String atoresprincipais;
    private double duracao;
    private int ano;

    public Filme (String titulo, String descricao, String genero, String idioma, String diretor, String atoresprincipais, double duracao, int ano){
        this.titulo= titulo;
        this.descricao= descricao;
        this.genero= genero;
        this.idioma=idioma;
        this.diretor=diretor;
        this.atoresprincipais=atoresprincipais;
        this.duracao=duracao;
        this.ano=ano;
    }
public Filme (){

}
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getDescricao(){
        return descricao;
    }
    public void setDescricao(String descricao){
        this.descricao=descricao;
    }
    public String getGenero(){
        return genero;
    }
    public void setGenero(String genero){
        this.genero=genero;
    }
    public String getIdioma(){
        return idioma;
    }
    public void setIdioma(String idioma){
        this.idioma=idioma;
    }
    public String getDiretor(){
        return diretor;
    }
    public void setDiretor(String diretor){
        this.diretor=diretor;
    }
    public String getAtoresprincipais(){
        return atoresprincipais;
    }
    public void setAtoresprincipais(String atoresprincipais){
        this.atoresprincipais= atoresprincipais;
    }
}

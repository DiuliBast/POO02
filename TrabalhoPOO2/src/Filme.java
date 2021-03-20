public class Filme implements IFilme {

    private String titulo;
    private String descricao;
    private String genero;
    private String idioma;
    private String diretor;
    private String atoresPrincipais;
    private double duracao;
    private int ano;

    public Filme (String titulo, String descricao, String genero, String idioma, String diretor, String atoresPrincipais, double duracao, int ano){
        this.titulo= titulo;
        this.descricao= descricao;
        this.genero= genero;
        this.idioma=idioma;
        this.diretor=diretor;
        this.atoresPrincipais=atoresPrincipais;
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
        return atoresPrincipais;
    }
    public void setAtoresprincipais(String atoresprincipais){
        this.atoresPrincipais= atoresprincipais;
    }

    @Override
    public boolean addFilme(Filme f) {
        return false;
    }

    @Override
    public Filme getFilme(String titulo) {
        return null;
    }

    @Override
    public boolean editarFilme(String titulo, String genero) {
        return false;
    }

    @Override
    public boolean removeFime(String titulo) {
        return false;
    }
}

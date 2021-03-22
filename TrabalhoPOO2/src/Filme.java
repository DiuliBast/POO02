import java.io.*;

public class Filme {


    private String genero;
    private String idioma;
    private String diretor;
    private String atoresPrincipais;
    private double duracao;
    private int ano;
    private Mídia título;
    private Mídia descricao;

    public Filme(String titulo, String descricao, String genero, String idioma, String diretor, String atoresPrincipais, double duracao, int ano){
        this.titulo= titulo;
        this.descricao= descricao;
        this.genero= genero;
        this.idioma=idioma;
        this.diretor=diretor;
        this.atoresPrincipais=atoresPrincipais;
        this.duracao=duracao;
        this.ano=ano;
    }

    public Filme(){
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
    public String getAtoresPrincipais(){
        return atoresPrincipais;
    }
    public void setAtoresPrincipais(String atoresPrincipais){
        this.atoresPrincipais= atoresPrincipais;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }


}



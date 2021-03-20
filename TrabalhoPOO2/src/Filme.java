import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
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

    public void criaArquivo(Filme f){
        Filme filme1;
        String linha;
        File arqFilme = new File ("/tmp/ListaDeFilmes.txt");

        try {
            if (!arqFilme.exists()) {
                arqFilme.createNewFile();
            } } catch (IOException e) {
        }

        try {
            FileReader frFilme = new FileReader(arqFilme);
            BufferedReader brFilme = new BufferedReader(frFilme);


            while (brFilme.ready()) {

                linha = brFilme.readLine();
                String dados [] = linha.split(";");


                titulo = dados [0];
                descricao = dados[1];
                genero = dados[2];
                idioma = dados[3];
                diretor = dados[4];
                atoresPrincipais = dados[5];
                duracao = Double.parseDouble(dados[6]);
                ano = Integer.parseInt(dados[7]);

                filme1 = new Filme(titulo, descricao, genero, idioma,diretor, atoresPrincipais, duracao,ano);
                filmes.add(filme1);

            }

            brFilme.close();
            frFilme.close();


        } catch (IOException e) {

        }


    }

    public static String tudoString(){
        String tudo = "";
        for(Filme f: filmes){
            tudo = tudo + f.toString() + "\n";

        }
        return tudo;
    }

    @Override
    public String toString() {
        return "Título = " + titulo +
                ", Descrição = '" + descricao + '\'' +
                ", Gênero = '" + genero + '\'' +
                ", Idioma = " + idioma + '\'' +
                ", Atores Principais = " + atoresPrincipais + '\'' +
                ", Duração = " + duracao + '\'' +
                ", Ano = " + ano + '\'' +
                ", Diretor = "  + diretor;
    }

    @Override
    public boolean addFilme(Filme f) {
        if(f == null){
            return false;
        }
        if (filmes.add(f))

            return true;
        else
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

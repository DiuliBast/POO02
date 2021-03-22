import java.io.*;

public class Filme {

    private String titulo;
    private String descricao;
    private String genero;
    private String idioma;
    private String diretor;
    private String atoresPrincipais;
    private double duracao;
    private int ano;


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

        if (f != null) {

            String linha;
            File arqFilme = new File("/Users/marcus/Downloads/ListaDeFilmes.txt");

            try {
                if (!arqFilme.exists()) {
                    arqFilme.createNewFile();
                }
            } catch (IOException e) {
            }

            try {
                FileReader frFilme = new FileReader(arqFilme);
                BufferedReader brFilme = new BufferedReader(frFilme);

// Te
                while (brFilme.ready()) {



                   filmes.add(f);


                }

                brFilme.close();
                frFilme.close();


            } catch (IOException e) {

            }

            try {
                FileWriter fw = new FileWriter(arqFilme);
                BufferedWriter bw = new BufferedWriter(fw);
                for (Filme fil : filmes) {
                    linha = f.getTitulo() + ";" + f.getDescricao() + ";" + f.getGenero() + ";" + f.getIdioma() + ";" + f.getDiretor() + ";"
                            + ";" + f.getAtoresPrincipais() + ";" + f.getDuracao() + ";" + f.getAno();
                    bw.write(linha);
                    bw.newLine();
                    bw.write("Teste");
                    bw.newLine();
                }
                bw.close();
                fw.close();
            } catch (IOException e) {

            }

            return true;
        }
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

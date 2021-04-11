import java.io.*;
import java.util.ArrayList;

public class Filme extends AudioVisual implements Serializable {

    private String diretor;
    public ArrayList<String> listAtoresPrincipais = new ArrayList<>();

    public Filme(String titulo, String descricao, String caminho, String genero, String idioma, String duração, String ano, String diretor) {
        super(titulo, descricao, caminho, genero, idioma, duração, ano);
        this.diretor = diretor;

    }

    public Filme() {
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }


    public void addAtorPrincipal(String ator) {
        listAtoresPrincipais.add(ator);
    }

    public String toString() {
        return  " " + "\n" +
                "Título = " + getTitulo() + "\n" +
                "Descrição = " + getDescricao() + "\n" +
                "Caminho = " + getCaminho() + "\n" +
                "Gênero = " + getGenero() + "\n" +
                "Idioma = " + getIdioma() + "\n" +
                "Duração = " + getDuração() + "\n" +
                "Ano = " + getAno() + "\n" +
                "Diretor = " + diretor + "\n" +
                " " + "\n" +
                "----------------------------------- " + "\n" +
                " ";

    }
}



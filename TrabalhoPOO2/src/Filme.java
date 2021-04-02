import java.io.*;
import java.util.ArrayList;

public class Filme extends AudioVisual implements Serializable {

    private String diretor;
    public ArrayList<String> listAtoresPrincipais = new ArrayList<>();

    public Filme(String titulo, String descricao, String caminho, String genero, String idioma, String duração, int ano, String diretor) {
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
        return "Título: " + getTitulo() +
                "Descrição  = '" + getDescricao() + '\'' +
                "Caminho =" + getCaminho() + '\'' +
                " Genero = '" + getGenero() + '\'' +
                "Idioma  = '" + getIdioma() + '\'' +
                "Duração  = '" + getDuração() + '\'' +
                "Ano  = '" + getAno() + '\'' +
                "Diretor  = '" + diretor;


    }
}



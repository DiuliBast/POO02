import java.io.*;
import java.util.ArrayList;

public class Filme extends AudioVisual implements Serializable, IMídia {

    private String diretor;
    private String atoresPrincipais;
  //  public ArrayList<String> listAtoresPrincipais = new ArrayList<>();

    public Filme(String titulo, String descricao, String caminho, String genero, String idioma, String duração, String ano, String diretor, String atoresPrincipais) {
        super(titulo, descricao, caminho, genero, idioma, duração, ano);
        this.diretor = diretor;
        this.atoresPrincipais= atoresPrincipais;

    }

    public Filme() {
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getAtoresPrincipais() {
        return atoresPrincipais;
    }

    public void setAtoresPrincipais(String atoresPrincipais) {
        this.atoresPrincipais = atoresPrincipais;
    }
// public void addAtorPrincipal(String ator) {
    //    listAtoresPrincipais.add(ator);
    //}

    public String toString() {
        return " " + "\n" +
                " -------------- (FILME) -------------- " + "\n" +
                "Título = " + getTitulo() + "\n" +
                "Descrição = " + getDescricao() + "\n" +
                "Caminho = " + getCaminho() + "\n" +
                "Gênero = " + getGenero() + "\n" +
                "Idioma = " + getIdioma() + "\n" +
                "Duração = " + getDuração() + "\n" +
                "Ano = " + getAno() + "\n" +
                "Diretor = " + diretor + "\n" +
                "AtoresPrincipais = " + atoresPrincipais + "\n" +

                " " + "\n" +
                "----------------------------------- " + "\n" +
                " ";

    }

}

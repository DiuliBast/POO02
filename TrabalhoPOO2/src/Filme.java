import java.io.*;

public class Filme extends AudioVisual implements IAudiovisual {



    private String diretor;
    private String atoresPrincipais;



    public Filme( String diretor, String atoresPrincipais){

        this.diretor=diretor;
        this.atoresPrincipais=atoresPrincipais;

    }

    public Filme(){
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


    @Override
    public String getDescrição() {
        return super.getDescrição();
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



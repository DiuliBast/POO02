import java.io.*;

public class Filme extends AudioVisual {

    private String diretor;
    private String atoresPrincipais;
    private AudioVisual audiovisual;


    public Filme( String diretor, String atoresPrincipais, AudioVisual audiovisual ){

        this.diretor=diretor;
        this.atoresPrincipais=atoresPrincipais;
        this.audiovisual=audiovisual;

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



}



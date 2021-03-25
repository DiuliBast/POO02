import java.util.ArrayList;

public class ArrayAudiovisual implements IAudiovisual {


    public static ArrayList<ArrayAudiovisual> listAudiovisual = new ArrayList<>();
    public static ArrayList<ArrayAudiovisual> listFilme = new ArrayList<>();
    public static ArrayList<ArrayAudiovisual> listMusica = new ArrayList<>();

    public static String tudoString() {
        String tudo = "";
        for (ArrayAudiovisual f : listFilme) {
            tudo = tudo + f.toString() + "\n";

        }
        return tudo;
    }

        public static String novoString(){
            String novo = "";
            for(ArrayAudiovisual m: listMusica){
                novo = novo + m.toString() + "\n";

            }
            return novo;


    }

    @Override
    public boolean addMusica(Musica m) {

        return false;
    }

    @Override
    public Musica getMusica(String titulo) {
        return null;
    }

    @Override
    public boolean editarMusica(String titulo, String genero) {
        return false;
    }

    @Override
    public boolean removeMusica(String titulo) {
        return false;
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

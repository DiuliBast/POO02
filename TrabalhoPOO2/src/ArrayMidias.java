import java.util.ArrayList;

public class ArrayMidias implements IMídia {

    public static ArrayList<ArrayMidias> listMidias = new ArrayList<>();
    public static ArrayList<ArrayMidias> listAutores = new ArrayList<>();
    public static ArrayList<ArrayMidias> listInterpretes = new ArrayList<>();
    public static ArrayList<ArrayMidias> listAtoresPrincipais = new ArrayList<>();

    @Override
    public boolean addMidia(Mídia m) {

        if(m == null){
            return false;
        }
        if (listMidias.add(m))
            return true;
        else
            return false;
    }

    @Override
    public Mídia getMídia(String titulo) {
        return null;
    }

    @Override
    public boolean editarMídia(String titulo) {
        return false;
    }

    @Override
    public boolean removeMídia(String titulo) {
        return false;
    }

    @Override
    public Mídia getMusicaFilme(String genero) {
        return null;
    }

    public static String novoString(){
            String novo = "";
            for(ArrayMidias m: listMidias){
                novo = novo + m.toString() + "\n";

            }
            return novo;

    }

}

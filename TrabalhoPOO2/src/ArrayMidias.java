import java.io.*;
import java.util.ArrayList;

public class ArrayMidias implements IMídia, Serializable {

    private static ArrayList<ArrayMidias> listMidias = new ArrayList<>();

  /*
    public static ArrayList<ArrayMidias> listAutores = new ArrayList<>();
    public static ArrayList<ArrayMidias> listInterpretes = new ArrayList<>();
    public static ArrayList<ArrayMidias> listAtoresPrincipais = new ArrayList<>();
   */

    @Override
    public boolean addMidia(Mídia m) {

        if (m == null) {
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


    public String toString() {
        String novo = "";
        for (ArrayMidias m : listMidias) {
            novo = novo + m.toString() + "\n";

        }
        return novo;
    }

    public void grava() throws Exception {

            System.out.println(listMidias.toString());
            ObjectOutputStream file = new ObjectOutputStream(new FileOutputStream("midias.bin"));
            System.out.println("aqui");
            file.writeObject(listMidias);
            System.out.println("aqui 2");
            file.close();
            System.out.println("aqui 3");

        }

    public void ler() throws Exception {

        ObjectInputStream file = new ObjectInputStream(new FileInputStream("midias.bin"));

        listMidias = (ArrayList<ArrayMidias>) file.readObject();
        System.out.println(listMidias.toString());
        file.close();

    }

    }


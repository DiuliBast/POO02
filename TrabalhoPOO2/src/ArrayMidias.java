import java.io.*;
import java.util.ArrayList;

import static javax.swing.UIManager.get;

public class ArrayMidias implements IMídia, Serializable {

    public static ArrayList<Mídia> listMidias = new ArrayList<>();

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
        try {
            System.out.println("*"+titulo+"*");
            for (Mídia m : listMidias) {
                System.out.println(m.getTitulo());
                if (m.getTitulo().equals(titulo)) {

                    System.out.println("encontrei"+m);
                    return m;
                }
            }

        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
            return null;
        }


        return null;
    }


    @Override
    public boolean editarMídia(String titulo) {
        Mídia  m = getMídia(titulo);
        if(m != null){
            m.setTitulo(m.getTitulo());
            return true;

        }else

            return false;
    }





    @Override
    public boolean removeMídia(String titulo) {
        try {
            for (Mídia m : listMidias) {
                if (m.getTitulo().equals(titulo)) {
                    listMidias.remove(m);
                    grava();
                    return true;
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
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

        ObjectOutputStream file = new ObjectOutputStream(new FileOutputStream("midias.bin"));
        file.writeObject(listMidias);
        file.close();

    }

    public void ler() throws Exception {

        ObjectInputStream file = new ObjectInputStream(new FileInputStream("midias.bin"));

        listMidias = (ArrayList<Mídia>) file.readObject();
        file.close();

    }

    public String exibir() {

        System.out.println(listMidias.toString());
        return null;
    }

}


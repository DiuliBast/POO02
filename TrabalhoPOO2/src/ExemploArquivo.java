import java.io.*;

public class ExemploArquivo {

    public void GeraArquivo() {

        try{
            FileOutputStream arquivo = new FileOutputStream("arquivo.txt");
            PrintWriter pr = new PrintWriter(arquivo);

            pr.println(Filme.tudoString());
            pr.close();
            arquivo.close();

        }catch(Exception e){
            System.out.println("Erro = "+e);
        }
    }
}




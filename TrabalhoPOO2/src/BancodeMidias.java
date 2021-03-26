import java.util.Scanner;
import java.util.*;

public class BancodeMidias {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        //ArrayAudiovisual f;
        //ArrayAudiovisual m;
        AudioVisual b;
        Filme f;
        ExemploArquivo a;
        Foto foto;
        int op;


        do {
            System.out.println(" Seja bem-vindo ");
            System.out.println(" 1. Gera arquivo ");
            System.out.println(" 2. Adicionar Filme: ");
            System.out.println(" 3. Exibir Filme: ");
            System.out.println("Informe sua opção");
            op = entrada.nextInt();

            switch (op) {

                case 1:
                    a = new ExemploArquivo();
                    System.out.println("Gera Arquivo");
                    a.GeraArquivo();
                    break;

                case 2:

                    f = new Filme();
                    System.out.println("Adicionar filme");
                    System.out.println("Insira o título do filme");
                    f.setTitulo(entrada.next());
                    System.out.println("Insira a descrição do filme");
                    f.setDescricao(entrada.next());
                    System.out.println("Digite o caminho: ");
                    f.setCaminho(entrada.next());
                    System.out.println("Insira o genero o filme");
                    f.setGenero(entrada.next());
                    System.out.println("Insira o idioma o filme");
                    f.setIdioma(entrada.next());
                    System.out.println("Insira a duração o filme");
                    f.setDuração(entrada.next());
                    System.out.println("Insira o ano o filme");
                    f.setAno(entrada.nextInt());
                    System.out.println("Digite o nome do diretor");
                    f.setDiretor(entrada.next());

                    try{

                    f.addMidia(f);
                    System.out.println("Terminado!");

                    }
                   catch(InputMismatchException e) {

                    System.err.println("DEU ERRO!");
                   }

                    break;

                case 3:
                    foto = new Foto();
                    System.out.println("Adicionar Foto");
                    System.out.println("Insira o título da foto");
                    foto.setTitulo(entrada.next());
                    foto.addFoto(foto);

                    break;

                case 0:

                    System.out.println("Você escolheu sair:");
                    break;
            }


        }while (op != 0);
    }
}

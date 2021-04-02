import java.util.Scanner;
import java.util.*;

public class BancodeMidias {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        //ArrayAudiovisual f;
        //ArrayAudiovisual m;
        ArrayMidias array = new ArrayMidias();
        AudioVisual b;
        Filme f;
        Foto foto;
        int op;

try {

    array.ler();

} catch (Exception e){

    System.out.println("Erro na leitura do arquivo");

}
        do {
            System.out.println(" Seja bem-vindo ");
            System.out.println(" 2. Adicionar Filme: ");
            System.out.println(" 3. Exibir Filme: ");
            System.out.println("Informe sua opção");
            op = entrada.nextInt();

            switch (op) {

                case 1:

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

                    array.addMidia(f);

                    try {

                        array.grava();

                    } catch (Exception e) {

                        System.out.println("Erro no arquivo!");
                    }



                    System.out.println("Terminado!");

                    break;

                case 2:

                  //  System.out.println("Exibir Filmes");
                  //  System.out.println(Filme.tudoString());

                    break;

                case 0:

                    System.out.println("Você escolheu sair:");
                    break;
            }


        }while (op != 0);
    }
}

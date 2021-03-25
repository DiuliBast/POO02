import java.util.Scanner;

public class BancodeMidias {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayAudiovisual f;
        ArrayAudiovisual m;
        int op;
        System.out.println(" Seja bem-vindo ");
        do {
            op = entrada.nextInt();
            switch (op) {
                case 0:

                    System.out.println("Você escolheu sair:");
                    break;
            }


        }while (op != 0);
    }
}

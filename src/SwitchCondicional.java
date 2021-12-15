import java.util.Scanner;

public class SwitchCondicional {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int menu = 0;
        System.out.print("1 - Abrir Netflix\n2 - Abrir Amazon Prime\n3 - Abrir HBO GO\n4 - Sair\n\nEscreva sua opção:");

        menu = leitor.nextInt();

        switch (menu) {

            case 1:
                System.out.print("NETFLIX");
                break;

            case 2:
                System.out.print("AMAZON PRIME");
                break;

            case 3:
                System.out.print("HBO GO");
                break;

            case 4:
                System.out.print("SAIR");
                break;

            default:
                System.out.print("\nVocê deve escolher as opções 1, 2, 3 ou 4");
        }

    }
}

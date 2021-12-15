import java.util.Scanner;

public class DesviosCondicionais {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int menu = 0;

        System.out.print("1 - Abrir Netflix\n2 - Abrir Amazon Prime\n3 - Abrir HBO GO\n4 - Sair\n\nEscreva sua opção:");

        menu = leitor.nextInt();

        if (menu == 1) {
            System.out.print("NETFLIX");
        }
        else if (menu == 2) {
            System.out.print("AMAZON PRIME");
        }
        else if (menu == 3) {
            System.out.print("HBO GO");
        }
        else if (menu == 4){
            System.out.print("SAIR");
        }
        else
           System.out.print("Opção invalida!");
    }
}

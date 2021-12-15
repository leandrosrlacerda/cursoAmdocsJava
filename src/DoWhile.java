import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int contador, limite, numero, resultado;

        contador = 0;
        limite = 10;

        System.out.print("Entre com o número para a execução da tabuada: ");
        numero = input.nextInt();

        do {
            resultado = numero * contador;
            System.out.print(numero + " x " + contador + "= " + resultado + "\n");
            contador++;
        } while (contador <= limite);

    }
}


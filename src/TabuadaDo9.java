import java.util.Scanner;

// Função do algoritmo: Calcular a média aritmética.
public class TabuadaDo9 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        // declaração de variaveis
        double nota1, nota2, nota3, nota4, media;
        String aluno;

        System.out.print("Entre com o nome do aluno: ");
        aluno = leitor.nextLine();

        System.out.print("Entre com a primeira nota: ");
        nota1 = leitor.nextDouble();

        System.out.print("Entre com a segunda nota: ");
        nota2 = leitor.nextDouble();

        System.out.print("Entre com a terceira nota: ");
        nota3 = leitor.nextDouble();

        System.out.print("Entre com a quarta nota: ");
        nota4 = leitor.nextDouble();

        // calcula a média das notas
        media = (nota1 + nota2 + nota3 + nota4) / 4;

        // verifica se a média é maior ou igual a 7
        if (media >= 7)
            System.out.println("\nO aluno " + aluno + " foi APROVADO!");
        // caso a média seja menor que 7
        else
            System.out.print("\nInfelizmente o aluno " + aluno + " foi REPROVADO!");


        System.out.println("\nSua média: " + media);

    }

}

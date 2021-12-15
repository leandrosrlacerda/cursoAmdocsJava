public class VetorMatriz {

    public static void main(String[] args) {

        String[] frutas = new String[4];
        int contador = 0;

        frutas[0] = "Maça";
        frutas[1] = "Pera";
        frutas[2] = "Uva";
        frutas[3] = "Jaca";

        String cesta[][] = {{"Maça", "100"}, {"Pêra", "200"}, {"Melão", "300"}};

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                if (j != 0)
                    System.out.print("Quantidade: " + cesta[i][j] + "\n\n");
                else
                    System.out.print("Fruta: " + cesta[i][j] + "\n");

            }
        }

        do {
            System.out.print("Produto: " + cesta[contador][0] + " Quantidade: " + cesta[contador][1] + "\n\n");
            contador++;
        } while (contador < 3);


        do {
            System.out.print(frutas[contador] + "\n");
            contador++;
        } while (contador <= 3);


    }
}

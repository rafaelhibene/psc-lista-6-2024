import java.util.Scanner;

public class Programa06{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numAlunos = 10;
        double[] medias = new double[numAlunos];
        int contadorAlunosAprovados = 0;
       
        for (int i = 0; i < numAlunos; i++) {
            double soma = 0;

            System.out.println("\nAluno " + (i + 1) + ":");
            for (int j = 0; j < 4; j++) {
                System.out.print("Digite a " + (j + 1) + "ª nota: ");
                double nota = scanner.nextDouble();
                soma += nota;
            }
            medias[i] = soma / 4;

            if (medias[i] >= 7.0) {
                contadorAlunosAprovados++;
            }
        }

        System.out.println("\nNúmero de alunos com média maior ou igual a 7.0: " + contadorAlunosAprovados);

        scanner.close();
    }
}
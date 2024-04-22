import java.util.Scanner;
public class Programa07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int vet[] = new int[5];
        System.out.println("Digite os 5 numeros inteiros");
        for (int i = 0; i < 5; i++) {
            vet[i] = scanner.nextInt();
        }

        int soma = 0;
        for (int i = 0; i < 5; i++) {
            soma += vet[i];          
        }

        int multiplicacao = 1;
        for (int i = 0; i < 5; i++) {
            multiplicacao = vet[i] * multiplicacao;
        }

        System.out.println("SOMA = " + soma);
        System.out.println("MULTIPLICAÇÃO = " + multiplicacao);
        System.out.print("NUMERO = ");
        for (int i = 0; i < 5; i++) {
            System.out.print(vet[i] + " ");
        }

        scanner.close();
    }
}

import java.util.Scanner;
public class Programa03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       double soma = 0;
        double[] vet = new double[4];
        for (int i = 0; i < 4; i++) {
            vet[i] = scanner.nextDouble();
            soma += vet[i];
        }
        scanner.close();


        double media = soma / 4;
        for (int i = 0; i < 4; i++) {
            System.out.println(vet[i]);
        }
        System.out.println("MEDIA = " + media);

    }
}

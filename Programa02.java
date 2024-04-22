import java.util.Scanner;
public class Programa02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] vet = new double[10];
        for (int i = 0; i < 10; i++) {
            vet[i] = scanner.nextDouble();
        }   

        System.err.println();
        System.err.println();

        for (int i = 9; i >= 0; i--) {
            System.out.println(vet[i]);
        }


        scanner.close();
    }
}

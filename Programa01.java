import java.util.Scanner;
public class Programa01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vet = new int[5];

        for (int i = 0; i < 5; i++) {
            vet[i] = scanner.nextInt();
        }
        scanner.close();
        
        System.out.println();

        for (int i = 0; i < 5; i++) {
            System.out.println(vet[i]);
        }
    }


}
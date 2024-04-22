import java.util.Scanner;
public class Programa04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contadorConsoante = 0;
        char [] vet = new char[10];
        for (int i = 0; i < 10; i++) {
            vet[i] = scanner.next().charAt(0);
        }

        for (int i = 0; i <= 9; i++) {
            if (vet[i] != 'a' && vet[i] != 'e' && vet[i] != 'i' && vet[i] != 'o' && vet[i] != 'u') {
                contadorConsoante++;
            }
            
        System.out.println("QUANTIDADE DE CONSOANTES = " + contadorConsoante);

            for (int q = 0; q <= 9; q++) {
                if (vet[q] != 'a' && vet[q] != 'e' && vet[q] != 'i' && vet[q] != 'o' && vet[q] != 'u') {
                    System.out.println(vet[q]);
                }

            }
        }
        scanner.close();
    }
}

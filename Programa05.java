import java.util.Scanner;
public class Programa05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[20];
        int[] par = new int[20];  
        int[] impar = new int[20];  

        int contadorPar = 0;
        int contadorImpar = 0;

        
        for (int i = 0; i < 20; i++) {
            numeros[i] = scanner.nextInt();

            if (numeros[i] % 2 == 0) {
                par[contadorPar] = numeros[i];
                contadorPar++;
            } else {
                impar[contadorImpar] = numeros[i];
                contadorImpar++;
            }
        }

        System.out.println("\nNúmeros lidos:");
        for (int i = 0; i < 20; i++) {
            System.out.print(numeros[i] + " ");
        }

        System.out.println("\n\nNúmeros pares:");
        for (int i = 0; i < contadorPar; i++) {
            System.out.print(par[i] + " ");
        }

        System.out.println("\n\nNúmeros ímpares:");
        for (int i = 0; i < contadorImpar; i++) {
            System.out.print(impar[i] + " ");
        }

        scanner.close();
    }
}

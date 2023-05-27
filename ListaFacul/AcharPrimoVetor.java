// 27. Leia 10 numeros inteiros e armazene em um vetor. Em seguida escreva os elementos ´
// que sao primos e suas respectivas posic¸ ˜ oes no vetor.
import java.util.Scanner;

public class AcharPrimoVetor {

    public static void main(String[] args) {
        int[] vetor = new int[10];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 10 números inteiros:");

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = scanner.nextInt();
        }

        System.out.println("Elementos primos e suas posições:");

        
        for (int i = 0; i < vetor.length; i++) {
            if (isPrimo(vetor[i])) {
                System.out.println("Elemento: " + vetor[i] + ", Posição: " + i);
            }
        }
    }

    public static boolean isPrimo(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
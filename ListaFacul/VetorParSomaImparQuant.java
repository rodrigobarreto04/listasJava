// 29. Faça um programa que receba 6 numeros inteiros e mostre: 
// • Os numeros pares digitados; 
// • A soma dos numeros pares digitados; 
// • Os numeros ímpares digitados;
// • A quantidade de numeros ímpares digitados;
import java.util.Scanner;

public class VetorParSomaImparQuant{

    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int i;
        int par = 0;
        int impar = 0;
        int v[] = new int [6];
        
        System.out.println("Digite 6 números inteiros");
        for(i=0;i<v.length;i++)
        {
            v[i]=scanner.nextInt();
        }
        for(i=0;i<v.length;i++){
            if(isPar(v[i])){
                System.out.println(v[i]+" é par!\n");
                par = (par + v[i]);
            }
        }
        System.out.println("A soma de todos os pares é igual a: "+par);
        for(i=0;i<v.length;i++){
            if(!isPar(v[i])){
                System.out.println(v[i]+" é impar!\n");
                impar = (impar+1);
            }
        }
        System.out.println("Temos "+impar+" números ímpares!");
    }
    public static boolean isPar(int num){
        if(num % 2 == 1){
            return false;
        }
        return true;
    }
}
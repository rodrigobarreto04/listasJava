import java.util.Scanner;
public class PrimeiroGrau{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o coeficiente A: ");
        double a = scanner.nextDouble();
        System.out.print("Digite o coeficiente B: ");
        double b = scanner.nextDouble();
        if(a == 0){
            System.out.println("Coeficientes não representam equação do primeiro grau!");
        }
        else{ 
            double x = -b/a;
            System.out.println("X= " + x);
        }
        scanner.close();
    }
}
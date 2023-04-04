import java.util.Scanner;
public class AreaTrapezio{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a base menor em metros: ");
        double bmenor = scanner.nextDouble();
        System.out.print("Digite a base maior em metros: ");
        double bmaior = scanner.nextDouble();
        System.out.print("Digite a altura em metros: ");
        double h = scanner.nextDouble();
        if(bmenor <= 0 || bmaior <= 0 || h <= 0 || bmaior == bmenor){
            System.out.println("Não é um trapézio!");
        }
        else{
            double Area = ((bmaior + bmenor) * h)/2;
            System.out.println("A Área é de: "+Area+" metro's");
        }
        scanner.close();
    }
} 
/*Entradas      Saída:
3   4   10      35m
7   2   2       9m
2   2   10      Não é um trapézio!
2   2   0       Não é um trapézio!
0   2   4       Não é um trapézio!
2   0   4       Não é um trapézio!

*/
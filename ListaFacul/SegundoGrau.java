import java.util.Scanner;
import java.lang.Math;
public class SegundoGrau{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o coeficiente A: ");
        double a = scanner.nextDouble();
        System.out.print("Digite o coeficiente B: ");
        double b = scanner.nextDouble();
        System.out.print("Digite o coeficiente C: ");
        double c = scanner.nextDouble();
        if(a == 0){
            System.out.println("Não apresenta equação do 2º grau");
        }
        else{
            double delt = (b*b-4*a*c);
            if(delt<0){
                System.out.println("Não apresenta raíz real");
            }
            else{
                double x1 = (-b + Math.sqrt(delt))/(2*a); 
                double x2 = (-b - Math.sqrt(delt))/(2*a);
                System.out.println("x1= " + x1+ ", x2= "+ x2);
            }
        }
        scanner.close();
    }
} 
/*Entradas              Saída:
0  1  1              Não apresenta equação do 2º grau       
1 -5  6   2,  3      x1= 3.0, x2= 2.0
1  0 -4   2, -2      x1= 2.0, x2= -2.0
1  0 +4              Não apresenta raíz real 
*/
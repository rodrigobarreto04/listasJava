// 23. Ler dois conjuntos de numeros reais, armazenando-os em vetores e calcular o produto 
// escalar entre eles. Os conjuntos tem 5 elementos cada. Imprimir os dois conjuntos e o 
// produto escalar, sendo que o produto escalar e dado por: x1 ∗ y1 + x2 ∗ y2 + ... + xn ∗ yn.

import java.util.Scanner;
public class ProdEscalarConj {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int i;
        double v[], v2[], v3[]; 
        v = new double[5];
        v2 = new double[5];
        v3 = new double[5];
        System.out.println(" Digite 5 números reais: ");
        for(i=0;i<v.length;i++){
            v[i]=scanner.nextDouble();
        }
        System.out.println("Digite outros 5 números reais: ");
        for(i=0;i<v.length;i++){
            v2[i]=scanner.nextDouble();
        }
        for(i=0;i<v.length;i++){
            v3[i]=(v[i]+v2[i]);
        }
        System.out.println("conjunto 1");
        for(i=0;i<v.length;i++){
            System.out.println(v[i]);
        }
        System.out.println("conjunto 1");
        for(i=0;i<v.length;i++){
            System.out.println(v2[i]);
        }
        System.out.println("conjunto 1 + conjunto 2");
        for(i=0;i<v.length;i++){
            System.out.println(v3[i]);
        }
    }
}

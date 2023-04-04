import javax.print.attribute.standard.JobHoldUntil;
import javax.swing.JOptionPane;
public class DiaSemana{
    public static void main(String[]args){
        int dia = Integer.parseInt(
            JOptionPane.showInputDialog("digite um valor de 1 a 7")
            );
        switch(dia){
            case 1:
            JOptionPane.showMessageDialog(null, "Domingo");
            break;
            case 2:
            JOptionPane.showMessageDialog(null, "Segunda");
            break;
            case 3:
            JOptionPane.showMessageDialog(null, "Terça");
            break;
            case 4:
            JOptionPane.showMessageDialog(null, "Quarta");
            break;
            case 5:
            JOptionPane.showMessageDialog(null, "Quinta");
            break;
            case 6:
            JOptionPane.showMessageDialog(null, "Sextouu!!!");
            break;
            case 7:
            JOptionPane.showMessageDialog(null, "Sábado");
            break;
            default: JOptionPane.showMessageDialog(null, "Dia inválido!");
            break;
        }
    }
}
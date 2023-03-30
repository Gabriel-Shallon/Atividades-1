package atv04;

import javax.swing.JOptionPane;

public class app {
    
    public static void main(String[] args){

        double nota[] = new double[4];
        double atitudinal;
        
        
        atitudinal = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual foi a nota do atitudinal?"));
        MediaNota mediaNota = new MediaNota(nota, atitudinal);
        
        double media = mediaNota.media();
        String status = mediaNota.status();
        JOptionPane.showMessageDialog(null, String.format("A média é = %.2f", media));
        JOptionPane.showMessageDialog(null, status);
    }

}

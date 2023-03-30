package atv06;

import javax.swing.JOptionPane;

public class app {
    
    public static void main (String[] args){

        int decimal = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o número decimal."));
        numExtenso numext1 = new numExtenso(decimal);
        String[] extenso = numext1.decimalPorExtenso();
       
        

      

        String resultado = "";
        for (int i = extenso.length - 1; i >= 0; i--) {
            if (extenso[i] != null) {
                if (extenso[i]=="zero"&&resultado==""){

                } else {
                resultado += extenso[i] + ", ";
                }
            }
        }

        JOptionPane.showMessageDialog(null, resultado);

        
    }

}


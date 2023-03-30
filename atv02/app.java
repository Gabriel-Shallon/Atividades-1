package atv02;

import javax.swing.JOptionPane;

public class app {
    
    public static void main(String[] args){
        int num;
        int nummulti;
        tabuada tabuada1 = new tabuada(num = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o número que será multiplicado?")), nummulti = Integer.parseInt(JOptionPane.showInputDialog(null, "Até que número "+num+" será multiplicado?")));

    }


}

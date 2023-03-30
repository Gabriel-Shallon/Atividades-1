package atv02;

import javax.swing.JOptionPane;

public class tabuada {
    
    protected int num;
    protected int nummulti;
    protected int resultado;


    tabuada(int num, int nummulti){

        this.num = num;
        this.nummulti = num;

        for (int i = 1; i < nummulti+1; i++){
            resultado = num*i;
            JOptionPane.showMessageDialog(null, num+" x "+i+" = "+resultado, "Multiplicação Num. "+i, 2);
        }

    }

     




}

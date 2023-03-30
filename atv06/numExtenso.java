package atv06;

import javax.swing.JOptionPane;

public class numExtenso {
    
    protected int decimal;
    protected String[] decimaisExt = {"zero", "um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove"};
    protected String[] extenso = new String[9];

    public numExtenso(int decimal){

        this.decimal = decimal;
        
    }

    public int[] separarDecimal(){
        int[] trad = new int[9];
        int resto = decimal;
        for (int i = 0; i < 9; i++){
            trad[i] = resto % 10;
            resto /= 10;
        }
        return trad;
    }

    public String[] decimalPorExtenso(){
        int[] trad = separarDecimal();
        for (int i = 0; i < 9; i++){
            extenso[i] = decimaisExt[trad[i]]; 
        }
        return extenso;
    }
}
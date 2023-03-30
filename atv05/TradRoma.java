package atv05;

import javax.swing.JOptionPane;

public class TradRoma {
    
    protected int decimal;
    protected String[][] romano = {{"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"},{"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"},{"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"},{"", "M", "MM", "MMM"}};
    protected String decimalromano = "";



    public TradRoma(){
        decimal = Integer.parseInt(JOptionPane.showInputDialog("Digite o número decimal: "));
        decimalromano = converterDecimalParaRomano(decimal);
        JOptionPane.showMessageDialog(null, decimal + " em romano é " + decimalromano);
    }


    
    public String converterDecimalParaRomano(int decimal) {
        String romano = "";
        int indice = 0;
        while (decimal > 0) {
            int resto = decimal % 10;
            romano = this.romano[indice][resto] + romano;
            decimal = decimal / 10;
            indice++;
        }
        return romano;
    }

}

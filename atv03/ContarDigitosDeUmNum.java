package atv03;

import javax.swing.JOptionPane;

public class ContarDigitosDeUmNum {
    
    protected double num; //double pra poder colocar mais digitos :)
    protected int digNum;

    ContarDigitosDeUmNum(double num){

        this.num = num;

        for (double i = num; i > 10; i++){

            i=i/10;
            digNum++;

        }

        JOptionPane.showMessageDialog(null, "O número "+num+" tem "+(digNum+1)+" digítos.");

    }

}

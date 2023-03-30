package atv01;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class app {
    
    

    public static void main (String[] args){

        int A = 0; 
        while (A!=1){

        int prod = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos produtos diferentes serão processados?"));

        for (int i = 0; i < prod; i++){

         double preco;
         int quant;
         String nome;
         int desconto;
         double valorfinal;

    produto produto1 = new produto(preco = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o Preço do produto"+(i+1))), quant = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a quantidade desse produto.")), nome = JOptionPane.showInputDialog(null, "Informe o nome do produto"+(i+1)));   

        desconto = produto1.desconto();
        valorfinal = produto1.valorfinal();
        

        JOptionPane.showMessageDialog(null, "Nome do Produto: "+nome+"\nPreço da unidade: "+preco+"\nQuantidade: "+quant+"x\n\n\nValor Total sem Desconto: "+preco*quant+"\nDesconto: "+desconto+"%\nValor Total Final: "+valorfinal); 

            }

            UIManager.put("OptionPane.yesButtonText","Sim");
            UIManager.put("OptionPane.noButtonText","Não");
            A = JOptionPane.showConfirmDialog(null, "Deseja executar novamente?","Reiniciar", JOptionPane.YES_NO_OPTION);

        }
    }

    


}

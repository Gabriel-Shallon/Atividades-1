package atv01;

import javax.swing.JOptionPane;

public class produto {
    
    protected double preco;
    protected int quant;
    protected String nome;
    protected int desconto;
    protected double valorfinal;

    produto(double preco, int quant, String nome){
     
        this.preco = preco;
        this.nome = nome;
        this.quant = quant;

    }
  
    public int desconto(){

        if (quant>10&&quant<=20){

            desconto = 10;

        } else if (quant>20&&quant<=50){

            desconto = 20;
        
        } else if (quant>50){

            desconto = 25;
        
        } else {

            desconto = 0;

        }
        return desconto;
    }
 

   
   public double valorfinal(){

    valorfinal = preco*quant-((quant*preco)*desconto/100);
    
    
    return valorfinal;
   }


    public String getNome(){
        return nome;
    }
    public double getPreco(){
        return preco;
    }
    public int getQuant(){
        return quant;
    }

}



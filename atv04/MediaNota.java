package atv04;

import javax.swing.JOptionPane;

public class MediaNota {
    
    protected double nota[];
    protected double atitudinal;
    protected double media;
    protected String status;
    
    MediaNota(double nota[], double atitudinal){

       this.nota = nota;
       this.atitudinal = atitudinal; 
       
    }

    public double media(){
        
       int avaquant = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantas avaliações foram feitas?(No máximo 4)"));

       for (int i = 0; i < avaquant; i++){

       nota[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual foi a nota da "+(i+1)+"° avaliação?"));

       }

       

       media = ((nota[0]+nota[1]+nota[2]+nota[3])/avaquant)*0.8+atitudinal;
        return media;
    }


    public String status(){
       
        if (media>=6){

           status = "Aprovado.";

        } else if (media<6&&media>4){

           status = "Verificação Suplementar.";

        } else {

           status =  "Reprovado.";

        }
       
        return status;
    }

}
